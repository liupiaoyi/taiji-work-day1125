package com.example;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class StudyApplicationTests {

	
	
	@Test
	public void contextLoads() {
		List<String> list = null;
		System.out.println("cccc");
			list.add("张三");
			System.out.println(list.toString());
		
	}

}
