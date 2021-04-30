
public class Ex06 {

	static int num1 = 3;
	static int num2 = 4;
	static String firstName = "동규";
	static String lastName = "도";
	static int radius = 3;
	static double pi = 3.14;
				
	
	public static void main(String[] args) {
		// 매개변수는 없지만 반환값이 있는 메서드
		int result = add();
		System.out.println(result);
		
		String fullName = name();
		System.out.println(fullName);
		
		double circle = area();
		System.out.println(circle);
		
		int square = rangleArea();
		System.out.println(square);
		
		
	}

	// 매개변수가 없는 경우에는 멤버필드값을 이용해서 결과를 얻을 때 사용
	public static int add() {
		return num1 + num2;
	}
	
	public static String name() {
		return lastName + firstName;
	}
	
	public static double area() {
		return radius * radius * pi;
	}
	
	public static int rangleArea() {
		return num1 * num2;
	}
	
	
}
