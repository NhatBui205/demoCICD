package com.poly;

import org.springframework.util.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.sum(2, 3),5);
	}
	
	@Test	
	public void testSub() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.sum(2, 2),0);
	}
	


}
