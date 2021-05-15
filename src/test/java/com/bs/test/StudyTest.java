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
	@DisplayName("스터디 만들기")
	void create_new_study() {
		Study study = new Study(-10);
		
		// assertAll 을 통해서 여러개의 오류를 한번에 볼 수 있다. 
		assertAll(
				() -> assertNotNull(study),
				() -> assertEquals(StudyStatus.DRAFT , study.getStatus(), () -> "스터디를 처음 만들면 상태값이 DRAFT여야 한다."),
				() -> assertTrue(study.getLimit() > 0, () -> "스터디 최대 참석 가능 인원은 0보다 커야 한다." )
				);
		
		
		// StudyStatus.DRAFT == study.getStatus()의 값과 다르다면 오른쪽의 메세지 값을 출력하게 된다. 
		// 1. 
		// assertEquals(StudyStatus.DRAFT , study.getStatus(), "스터디를 처음 만들면 상태값이 DRAFT여야 한다.");
		
		// 2.
//		assertEquals(StudyStatus.DRAFT, study.getStatus(), new Supplier<String>() {
//			@Override
//			public String get() {
//				return "스터디를 처음 만들면  DRAFT상태이다";
//			}
//		});
		
		// 3.
		// assertEquals(StudyStatus.DRAFT , study.getStatus(), () -> "스터디를 처음 만들면 상태값이 DRAFT여야 한다."),
		
		// 3번 방법이 좋은 이유 
				// 람다식 연산을 이용하게 되면 해당 함수의 조건이 수행되었을 때만 실행되게 되어 문자열 연산을 필요할 때만 할 수 있다. 
				// but 1번은 항상 실행
				
		//  study.getLimit() > 0 보다 크지 않은면 메시지를  출력하는 함수 
		
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
