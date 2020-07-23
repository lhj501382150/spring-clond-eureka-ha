package com.hml.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringRedisApplication.class)
public class SpringRedisTest {

	@Test
	public void testSet(){
		System.out.println("--------");
	}
}
