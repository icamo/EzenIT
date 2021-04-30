
public class Ex04 {

	public static void main(String[] args) {
				
		int result = add(4, 5);
		System.out.println(result);
		
		String fullName = name("동규","도");
		System.out.println(fullName);
		
		double circle = area(5, 3.14);
		System.out.println(circle);
		
		int rangle = rangleArea(4, 3);
		System.out.println(rangle);
		
		System.out.println("==========");
		
		
	}
	
	
	// static메서드에서 메서드를 호출하려면 static메서드이어야 한다. (개체 미생성시)
	// 메서드의 4가지 종류
	// 기본 메서드 : 매개변수가 있고 반환값이 있는 메서드
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static String name(String firstname, String lastname) {
		return lastname + firstname;
	}
	
	public static double area(int radius, double pi) {
		return pi * radius * radius;
	}
	
	public static int rangleArea(int x, int y) {
		return x * y;
	}	
	

}
