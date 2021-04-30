package inheritance;

public class Ex24Test {

	public static void main(String[] args) {
		Ex24 ex = new Ex24(3, 3.141592, "Å×½ºÆ®1");
		System.out.println(ex.subject);
		double result = ex.area();
		System.out.println(result);
		System.out.println(Math.PI);
		result = ex.area(Math.PI);
		System.out.println(result);
	}

}
