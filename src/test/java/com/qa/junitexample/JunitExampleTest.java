package com.qa.junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitExampleTest {
	
	// @BeforeAll, @AfterAll - special annotations, these must be static
	// @BeforeEach, @AfterEach
	
	@Test
	public void addTest() {
		int result = Calculator.addNums(5, 7);
		assertEquals(12, result);
	}
	
	@Test
	public void subTest() {
		int result = Calculator.subtractNums(10, 5);
		assertEquals(5, result);
	}
	
	@Test
	public void multTest() {
		int result = Calculator.multiplyNums(5, 10);
		assertEquals(50, result);
	}
	
	@Test
	public void divideTest() {
		int result = Calculator.divideNums(40, 2);
		assertEquals(20, result);
	}
	
	@Test
	public void modTest() {
		int result = Calculator.modNums(7, 3);
		assertEquals(1, result);
	}

}
