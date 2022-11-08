package com.springboot.account;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@DataMongoTest
@TestPropertySource(properties = "spring.mongodb.embedded.version=3.5.5")
@ActiveProfiles("test")
class AccountRepositoryTest {

	@Autowired
	AccountRepository accountRepository;

	@Test
	void findByEmail() {
		Account account = new Account();
		account.setUsername("hyeonse");
		account.setEmail("hslee@email.com");
		accountRepository.save(account);

		Optional<Account> byId = accountRepository.findById(account.getId());
		assertThat(byId).isNotEmpty();
		Optional<Account> byEmail = accountRepository.findByEmail(account.getEmail());
		assertThat(byEmail).isNotEmpty();
	}

}
