package com.springboot;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired BookRepository bookRepository;
	
	@PostConstruct
	public void init() {
		Book book = new Book();
		book.setIsbn("123123");
		book.setTitle("스프링 부트 업데이트");
		book.setPublished(LocalDate.of(2022, 11, 22));
		bookRepository.save(book);
	}
}
