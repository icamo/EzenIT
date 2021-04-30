package package01;

public class Ex03Test {

	public static void main(String[] args) {
		int i = 1;
		int j = i;
		System.out.println(i);
		System.out.println(j);
		
		Ex02 ex = new Ex02();
		Ex02 ex1 = ex;
		ex.num1 = 20;
		ex.num2 = 10;
		ex1.add();
		
		int i1 [] = new int[3];
		i1[0] = 1;
		i1[1] = 2;
		i1[2] = 3;
		int i2 [] = i1;
		System.out.println(i1[0]);
		System.out.println(i2[0]);
		
		Ex02 [] ex2 = new Ex02[3];
		ex2[0] = new Ex02();
		ex2[1] = new Ex02();
		ex2[2] = new Ex02();
		
		Ex02 [] ex3 = ex2;		
		ex2[0].num1 = 100;
		ex2[0].num2 = 200;
		ex3[0].add();		
	}

}
