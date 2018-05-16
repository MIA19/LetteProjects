package de.lette.task.other;

public class TestException {

	public static void main(String[] args) {
		System.out.println(new TestException().divideBy(0));
	}
	
	public double divideBy(int i)	{
		return 5.0 / i;
	}

}
