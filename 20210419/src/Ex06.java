
public class Ex06 {

	static int num1 = 3;
	static int num2 = 4;
	static String firstName = "����";
	static String lastName = "��";
	static int radius = 3;
	static double pi = 3.14;
				
	
	public static void main(String[] args) {
		// �Ű������� ������ ��ȯ���� �ִ� �޼���
		int result = add();
		System.out.println(result);
		
		String fullName = name();
		System.out.println(fullName);
		
		double circle = area();
		System.out.println(circle);
		
		int square = rangleArea();
		System.out.println(square);
		
		
	}

	// �Ű������� ���� ��쿡�� ����ʵ尪�� �̿��ؼ� ����� ���� �� ���
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
