package package12;

public class Ex15Test {

	public static void main(String[] args) {
		Ex14 ex1 = new Ex14(20,10);
		int i = 1000;
		intPrint(1000);
		objPrint(new Ex14(20,10));
	}
	public static void objPrint(Ex14 ex) { // Ex14 ex = new Ex14()
		System.out.println(ex.add());
	}
	public static void intPrint(int i) { // int i = 111
		System.out.println(i);
	}

}
