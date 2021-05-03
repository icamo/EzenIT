package package03;

import java.util.Random;

public class Ex10Test {

	public static void main(String[] args) {
		
		double num = Math.random();
		System.out.println(num);
		
		int num1 = (int)Math.random();
		int num2 = (int)(0.25);
		int num3 = (int)(1.65);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt(45));
		
		
	}

}
