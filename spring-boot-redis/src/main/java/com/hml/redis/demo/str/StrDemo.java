package com.hml.redis.demo.str;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class StrDemo {

	@Autowired
	private RedisTemplate<String, Object> template;
	
	public void demo(){
		template.opsForValue().increment("a");//增加
		
	}
}
