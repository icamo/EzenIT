package package12;

public class Ex16Test {

	public static void main(String[] args) {
		int i = 1000;
		System.out.println(i);
		Ex14 ex = new Ex14(20,10);
		int result = ex.add();
		System.out.println(result);
		
		intPrint(1000);
	}
	public static void intPrint(int i) {
		System.out.println(i);
	}

}
