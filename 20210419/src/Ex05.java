
public class Ex05 {

	public static void main(String[] args) {

		add(4,5);
		fullName("동규","도");
		area(3, 3.14);
		rangleArea(3, 4);
	}

	// 매개변수는 있지만 반환값이 없는 메서드
	// 반환형을 void로 적어주면 반환값이 없는 메서드가 된다.
	// 반환값이 없는 경우에는 메서드내에서 결과를 확인할 수 있어야 한다.
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void fullName(String firstname, String lastname) {
		System.out.println(lastname + firstname);
	}
	
	public static void area(int radius, double pi) {
		System.out.println(radius * radius * pi);
	}
	
	public static void rangleArea(int num1, int num2) {
		int result = num1 * num2; 
		System.out.println(result);
	}

}
