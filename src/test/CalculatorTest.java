package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	@Test
	public void add3and4() throws Exception {
		Calculator sut = new Calculator();
		assertThat(sut.add(3,4), is(7));
	}
}
