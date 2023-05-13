package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableRedisRepositories
public class Redisconfig {
	
	
	@Bean
	public JedisConnectionFactory connectionfactory()
	{
		RedisStandaloneConfiguration config=new RedisStandaloneConfiguration();
		config.setHostName("localhost");
		config.setPort(6379);
		
		return new JedisConnectionFactory(config);
		
	}
	
	@Bean
	public RedisTemplate<String,Object> template()
	{
		RedisTemplate<String,Object> template=new RedisTemplate<>();
		template.setConnectionFactory(connectionfactory());
		
		return template;
		
	}
}
