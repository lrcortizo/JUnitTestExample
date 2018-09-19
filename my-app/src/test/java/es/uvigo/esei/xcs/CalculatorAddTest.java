package es.uvigo.esei.xcs;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class CalculatorAddTest {
	private Calculator calculator;
	private int op1;
	private int op2;
	private int result;
	
	@Before
	public void preTest(){
		System.out.println("pretest");
		calculator = new Calculator();
	}
	
	@After
	public void postTest(){
		System.out.println("postTest");
		calculator = null;
	}
	
	@BeforeClass
	static public void init(){
		System.out.println("beforeClass");
	}
	
	@AfterClass
	static public void end(){
		System.out.println("afterClass");
	}
	
	@Parameters(name = "{0}")
	public static Collection<Object[]> parameters() {
		return Arrays.asList(
				new Object[] {"Pos + Pos", 10, 20, 30},
				new Object[] {"Neg + Pos", -10, 20, 10},
				new Object[] {"Pos + Neg", 10, -20, -10}
		);
	}
	
	public CalculatorAddTest(Object x, int op1, int op2, int result) {
		this.op1 = op1;
		this.op2 = op2;
		this.result = result;
	}
	
	@Test
	public void testAdd(){
		//GIVEN
			//see parameters() function
		
		//WHEN
		int result = calculator.add(this.op1, this.op2);
		
		//THEN
		assertThat(result, is(equalTo(this.result)));
	}
}
