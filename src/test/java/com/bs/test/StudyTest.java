package com.bs.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Supplier;

import javax.annotation.processing.Messager;

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
	@DisplayName("���͵� �����")
	void create_new_study() {
		Study study = new Study(-10);
		
		// assertAll �� ���ؼ� �������� ������ �ѹ��� �� �� �ִ�. 
		assertAll(
				() -> assertNotNull(study),
				() -> assertEquals(StudyStatus.DRAFT , study.getStatus(), () -> "���͵� ó�� ����� ���°��� DRAFT���� �Ѵ�."),
				() -> assertTrue(study.getLimit() > 0, () -> "���͵� �ִ� ���� ���� �ο��� 0���� Ŀ�� �Ѵ�." )
				);
		
		
		// StudyStatus.DRAFT == study.getStatus()�� ���� �ٸ��ٸ� �������� �޼��� ���� ����ϰ� �ȴ�. 
		// 1. 
		// assertEquals(StudyStatus.DRAFT , study.getStatus(), "���͵� ó�� ����� ���°��� DRAFT���� �Ѵ�.");
		
		// 2.
//		assertEquals(StudyStatus.DRAFT, study.getStatus(), new Supplier<String>() {
//			@Override
//			public String get() {
//				return "���͵� ó�� �����  DRAFT�����̴�";
//			}
//		});
		
		// 3.
		// assertEquals(StudyStatus.DRAFT , study.getStatus(), () -> "���͵� ó�� ����� ���°��� DRAFT���� �Ѵ�."),
		
		// 3�� ����� ���� ���� 
				// ���ٽ� ������ �̿��ϰ� �Ǹ� �ش� �Լ��� ������ ����Ǿ��� ���� ����ǰ� �Ǿ� ���ڿ� ������ �ʿ��� ���� �� �� �ִ�. 
				// but 1���� �׻� ����
				
		//  study.getLimit() > 0 ���� ũ�� ������ �޽�����  ����ϴ� �Լ� 
		
	}                       
	


	@Test
	@DisplayName("�� �ٸ� ���͵� �����")
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
