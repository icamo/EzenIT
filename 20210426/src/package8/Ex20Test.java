package package8;

import package6.KumhoTire;
import package6.Tire;
import package7.Car;

public class Ex20Test {
	public static void main(String [] args) {
		int i = 10;
		int j = i; // int j = 10;
		
		int [] i1 = {1,2,3,4,5};
		int [] k = i1; // int [] k = {1,2,3,4,5};
		
		print(10);
		print(i);
		arrayPrint(i1);
		double d = 10.6;
		int ii = 10;
		Car car = new Car();
		Tire t = new Tire();
		t = new KumhoTire();
	}   
	public static void print(int a) {
		System.out.println(a);
	}
	public static void arrayPrint(int [] m) { // int[]m ={1,2,3,4}
		int sum = 0;
		for(int z : m) {
			sum += z;
		}
		System.out.println(sum);
	}
}
