package com.example.demo.Repository;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.URLDTO;
import com.example.demo.Entity.Url;

@Repository
@Component
public class Redisrepo {
	
	public static final String HASH_KEY="Url";

	@Autowired
	RedisTemplate<String,Object> template;
	
	@Autowired
	Url ul;
	
	public Url setsave(URLDTO udt)
	{
		String encodeurl=com.google.common.hash.Hashing.murmur3_32().hashString(udt.getOriginalurl(), StandardCharsets.UTF_8).toString();
		ul=new Url(udt.getOriginalurl(),encodeurl,udt.getName());
		template.opsForHash().put(HASH_KEY, ul.getId(), ul);
		return ul;
	}
	public String getURL(String encodedUrl)
	{
		List<Object> li=template.opsForHash().values(HASH_KEY);
		Url[] lis1=new Url[li.size()];
		lis1=li.toArray(lis1);
		for(Url u:lis1)
			return u.getOriginal_Url();
			
	return null;
		
	}
}
