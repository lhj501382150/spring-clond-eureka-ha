package com.hml.redis.config;

import org.springframework.context.annotation.Configuration;

/**
 * Redis配置springboot 1.5.10
 * @author PC-2020
 * 
 * <dependency>
             <groupId>org.springframework.boot</groupId>
             <artifactId>spring-boot-starter-data-redis</artifactId>
		 </dependency> 
		  <dependency>
            <groupId>redis.clients</groupId>
            <artifactId>jedis</artifactId>
        </dependency>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-pool2</artifactId>
        </dependency>
@Configuration
 *
 */
public class RedisConfig1510 {

	/*@Bean
	@ConfigurationProperties(prefix="spring.redis.pool")
	public JedisPoolConfig jedisPoolConfig(){
		JedisPoolConfig config = new JedisPoolConfig();
		
		return config;
	}
	
	@Bean
	public JedisConnectionFactory jedisConnectionFactory(JedisPoolConfig config){
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setPoolConfig(config);
		
		return factory;
	}
	
	
	@Bean
	public RedisTemplate<String,Object> redisTemplate(JedisConnectionFactory factory){
		RedisTemplate<String, Object> redisTemplate =new RedisTemplate<>();
		redisTemplate.setConnectionFactory(factory);
		
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		
		redisTemplate.setValueSerializer(new StringRedisSerializer());
		
		return redisTemplate;
	}*/
}
