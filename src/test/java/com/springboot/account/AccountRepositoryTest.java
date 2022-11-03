package com.springboot.account;

import static org.junit.jupiter.api.Assertions.*;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;

@DataJpaTest
class AccountRepositoryTest {

	@Autowired DataSource dataSource;
	@Autowired JdbcTemplate jdbcTemplate;
	@Autowired AccountRepository accountRepository;

	@Test
	void di() {

	}

}
