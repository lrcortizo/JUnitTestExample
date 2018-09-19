package es.uvigo.esei.xcs;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class CalculatorTest{
	private Calculator calculator;
	
	@Before
	public void preTest(){
		calculator = new Calculator();
	}
	
	@Test
	public void testAddPositiveAndPositive(){
		//GIVEN
		int op1 = 3;
		int op2 = 7;
		int expected = 10;
		
		//WHEN
		int result = calculator.add(op1, op2);

		//THEN
		assertThat(result, is(equalTo(expected)));
	}
}
