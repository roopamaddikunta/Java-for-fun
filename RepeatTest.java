package com.enterprise.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RepeatTest {

	//These are the three test cases. 
	@Test
	
	public void test(){
		Repeat r = new Repeat();
		assertEquals(1,r.repeat(8999780L,689980L));
		
	}
public void test1(){
	Repeat r = new Repeat();
assertEquals(0,r.repeat(45789997,567890));
}
public void test2(){
	Repeat r = new Repeat();
assertEquals(0,r.repeat(3339087,455373));
	
	}
	
}
