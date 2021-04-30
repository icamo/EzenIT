package package01;

public class Ex04Test {
	public static void main(String[] args) {
		int i = 10;
		System.out.println("i : " + i );
		int j = i;
		System.out.println("j : " + j );
		intPrint(i);
		
		int [] i1 = new int[3];
		i1[0] = 1;
		i1[1] = 2;
		i1[2] = 3;
		int i2 [] = i1;
		System.out.println(i2[0]);
		intArrayPrint(i1);
		
		Ex02 ex = new Ex02();
		Ex02 ex1 = ex;
		ex.num1 = 10;
		ex1.num2 = 20;
		ex.add();
		objPrint(ex);
		
		Ex02 [] ex2 = new Ex02[3];
		ex2[0] = new Ex02();
		ex2[1] = new Ex02();
		ex2[2] = new Ex02();
		Ex02 ex3 [] = ex2;
		ex2[0].num1 = 200;
		ex3[0].num2 = 100;
		ex3[0].add();
		ex2[0].sub();
		Ex02 ex5 [] = ex2;
		ex5[0].mul();
		objArrayPrint(ex2);
	}
	public static void objArrayPrint(Ex02 ex4 [] ) { // Ex02 ex4 [] = ex2;
		ex4[0].add();
	}
	public static void objPrint(Ex02 ex1) { // Ex02 ex1 = ex 
		ex1.sub();
	}
	public static void intArrayPrint(int i2 []) { // int i2[] = i1;
		System.out.println(i2[0]);
	}
	public static void intPrint(int j) { // int j = i;
		System.out.println("j : " + j);
	}
}
