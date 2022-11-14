package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.springboot.account.Account;
import com.springboot.account.AccountService;

@Component
public class AccountRunner implements ApplicationRunner {
	
	@Autowired
	private AccountService accountService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Account account = accountService.createAccount("hslee", "1234");
		System.out.println(account.getUsername() + " password: " + account.getPassword());
	}

}
