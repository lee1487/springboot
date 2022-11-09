package com.springboot.account;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AccountRepository extends Neo4jRepository<Account, Long> {

	Optional<Account> findByEmail(String email);

}
