package com.springboot;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import com.springboot.account.Account;
import com.springboot.account.AccountRepository;
import com.springboot.account.Role;

public class Neo4jRunner implements ApplicationRunner{

	@Autowired
	AccountRepository accountRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		 Account account = new Account();
		 account.setEmail("aa@email.com");
		 account.setUsername("aa");

		 Role role = new Role();
		 role.setName("user");

		 account.getRoles().add(role);

		accountRepository.save(account);

		System.out.println("finished");
	}

}
