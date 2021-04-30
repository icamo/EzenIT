package package8;

public class Ex26Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int [] j = {1,2,3,4,5};
		Ex23 ex = new Ex23();
		Ex23 [] ex1 = new Ex23[3];
		intPrint(i);
		intArrayPrint(j);
		objPrint(ex);
		objArrayPrint(ex1);		
	}
	public static void objArrayPrint(Ex23 [] a) {
		a[0] = new Ex23();
		a[0].num1 = 20;
		a[0].num2 = 10;
		a[0].sum();
	}
	public static void objPrint(Ex23 a) { // Ex23 a = new Ex23();
		a.num1 = 20;
		a.num2 = 30;
		a.sum();
	}
	public static void intArrayPrint(int [] a) {
		System.out.println(a[0]);
	}
	public static void intPrint(int a) {
		System.out.println(a);
	}
}