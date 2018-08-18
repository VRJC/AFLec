import Interfaces.ICalculator;

public class Calculator implements ICalculator {

	@Override
	public int add(int value1, int value2) {
		return value1+value2;
	}

	@Override
	public int multiply(int value1, int value2) {
		return value1*value2;
	}

	@Override
	public int substract(int value1, int value2) {
		return value1-value2;
	}

	@Override
	public int devide(int value1, int value2) {
		return value1/value2;
	}

}
