package com.springboot;

import java.time.Duration;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Component
@ConfigurationProperties("hyeonse")
@Validated
public class HyeonseProperties {

	@NotEmpty
	private String name;


	private int age;
	private String fullname;

	private Duration sessionTimeout = Duration.ofSeconds(30);

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Duration getSessionTimeout() {
		return sessionTimeout;
	}
	public void setSessionTimeout(Duration sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
	}



}
