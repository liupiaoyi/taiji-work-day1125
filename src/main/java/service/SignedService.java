package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class SignedService {
	
	private static int count = 0;
	private static List<String> list = new ArrayList<>();
	
	public Stream<String> getName(){
		return Stream.generate(new Supplier<String>() {
			
			@Override
			public String get() {	
				String inputStr = inputString("  请选择相关操作：---1：签到；2：查询；3：查看签到人数---");
				if("1".equals(inputStr)) {
					count++;
					String name = inputString("请输入姓名：  ");
					list.add(name);
					return name+" 先生/小姐 已签到";					
				} 
				else if ("2".equals(inputStr)) {

					String searchName = inputString("请输入查询姓名：  ");
					
					for (String string : list) {
						if( string.equals(searchName) ) {
							return searchName+"先生/小姐 已签到";
						}
					}
					
					return searchName+"先生/小姐 尚未签到";
				}
				else if ("3".equals(inputStr)) {
					return "当前签到人数一共有 "+count+" 人/n";
				} else {
					return "输入有误";
				}
				
			}});
	}
	
	public static String inputString( String info ){
		System.out.print(info);
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}

}
