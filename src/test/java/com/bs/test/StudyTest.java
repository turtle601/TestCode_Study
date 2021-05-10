package com.bs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

	@Test
	@DisplayName("스터디 만들기")
	void create_new_study() {
		Study study = new Study();
		assertNotNull(study);
		System.out.println("do first test");
	}
	
	@Test
	@DisplayName("또 다른 스터디 만들기")
	void create_new_study_again() {
		System.out.println("do second test");
		
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All");
		
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After All");
		
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each");
		
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After Each");
		
	}
}
