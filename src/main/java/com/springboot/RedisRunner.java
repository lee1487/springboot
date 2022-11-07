package com.springboot;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import com.springboot.account.Account;
import com.springboot.account.AccountRepository;

@Component
public class RedisRunner implements ApplicationRunner {

	@Autowired StringRedisTemplate redisTemplate;
	@Autowired AccountRepository accountRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ValueOperations<String, String> values = redisTemplate.opsForValue();
		values.set("hyeonse", "blackship");
		values.set("springboot", "2.7.4");
		values.set("hello", "world");

		Account account = new Account();
		account.setEmail("dlgustp1487@naver.com");
		account.setUsername("hyeonse");
		accountRepository.save(account);
		Optional<Account> findById = accountRepository.findById(account.getId());
		System.out.println(findById.get().getUsername());
		System.out.println(findById.get().getEmail());
	}

}
