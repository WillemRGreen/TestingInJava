package com.qa.junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BlackjackTest {
	
	@Test
	public void test1() {
		int result = Blackjack.play(22, 22);
		assertEquals(0, result);
	}
	
	@Test
	public void test2() {
		int result = Blackjack.play(22, 15);
		assertEquals(15, result);
	}
	
	@Test
	public void test3() {
		int result = Blackjack.play(15, 22);
		assertEquals(15, result);
	}
	
	@Test
	public void test4() {
		int result = Blackjack.play(15, 18);
		assertEquals(18, result);
	}

}

//possible outcomes:
//both above 21 assert result 0
//dealer > 21 assert player
//player > 21 assert dealer 
//neither > 21 assert result = greater of the two