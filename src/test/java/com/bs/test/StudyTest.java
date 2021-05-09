package com.bs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudyTest {

	@Test
	void test() {
		Study study = new Study();
		assertNotNull(study);
		System.out.println("do first test");
	}

}
