package package8;

public class Ex25Test {

	public static void main(String[] args) {
		int i = 10;
		int j = i;
		Ex23 ex = new Ex23();
		Ex23 ex1 = ex;
		
		int i1 [] = {1,2,3,4,5};
		int j1 [] = i1;
		Ex23 [] ex2 = new Ex23[3];
		Ex23 [] ex3 = ex2;	
		print(j);
		objPrint(ex);
		arrayPrint(j1);
		arrayObjPrint(ex3);
	}
	public static void arrayObjPrint(Ex23 [] a) {
		a[0] = new Ex23();
		a[0].num1 = 10;
		a[0].num2 = 20;
		a[0].sum();		
	}
	public static void arrayPrint(int [] a) {
		System.out.println(a[0]);
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void objPrint(Ex23 a) {
		a.num1 = 10;
		a.num2 = 20;
		a.sub();
	}

}
