import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Interfaces.ICalculator;

class CalculatorTest {
	
	public ICalculator cal;
	
	@BeforeEach
	void setup() {
		cal = new Calculator();
	}

	@Test
	void testAdd() {
		int value1 = 5;
		int value2 = 3;
		int answer;

		answer= cal.add(value1, value2);
		assertEquals(answer, 8);
	}

}
