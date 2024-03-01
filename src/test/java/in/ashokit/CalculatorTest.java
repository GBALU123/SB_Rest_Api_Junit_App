package in.ashokit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import in.ashokit.beans.Calculator;

public class CalculatorTest {

	@Test
	public void addTest() {
		Calculator c = new Calculator();
		int actualResult = c.add(10, 20);
		
		assertEquals(30, actualResult);
	}
	@Test
	public void multTest() {
		Calculator c = new Calculator();
		int  actualRes = c.mult(10, 50);
		assertEquals(500, actualRes);
	}
}
