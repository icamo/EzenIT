
public class Ex07 {
	
	static int num1 = 3;
	static int num2 = 4;
	static String firstName = "동규";
	static String lastName = "도";
	static int radius = 3;
	static double pi = 3.14;
	
	

	public static void main(String[] args) {
		// 매개변수도 없고 반환값도 없는 메서드
		// 매개변수가 없다는 것은 내부의 값(멤버필드 값)을 사용하여 결과를 얻는다는 말과 같다.
		
		add();
		name();
		area();
		rangleArea();
				
		
	}
	
	public static void add() {
		System.out.println(num1 + num2);
	}
	
	public static void name() {
		System.out.println(lastName + firstName);
	}
	
	public static void area() {
		System.out.println(radius * radius * pi);
	}
	
	public static void rangleArea() {
		System.out.println(num1 * num2);
	}
	
}
