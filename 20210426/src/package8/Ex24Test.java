package package8;

public class Ex24Test {
	public static void main(String[] args) {
		int [] i = new int[3];
		i[0] = 10; // int a = 10;
		i[1] = 20;
		i[2] = 30;
		Ex23 ex1 = new Ex23();
		Ex23 [] ex = new Ex23[3];
		ex[0] = new Ex23(); // Ex23 ex = new Ex23();
		ex[1] = new Ex23();
		ex[2] = new Ex23();
		print(i);
		exPrint(ex1);
		int j = 20;
		intPrint(j);
		objPrint(ex);
	}
	public static void objPrint(Ex23 [] a) {
		
	}
	public static void intPrint(int a) {
		System.out.println();
	}
	public static void exPrint(Ex23 a) {
		a.num1 = 10;
		a.num2 = 20;
		a.sum();
	}
	public static void print(int [] j) {
		System.out.println(j[0]);
		System.out.println(j[1]);
		System.out.println(j[2]);
	}
}
