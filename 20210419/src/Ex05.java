
public class Ex05 {

	public static void main(String[] args) {

		add(4,5);
		fullName("����","��");
		area(3, 3.14);
		rangleArea(3, 4);
	}

	// �Ű������� ������ ��ȯ���� ���� �޼���
	// ��ȯ���� void�� �����ָ� ��ȯ���� ���� �޼��尡 �ȴ�.
	// ��ȯ���� ���� ��쿡�� �޼��峻���� ����� Ȯ���� �� �־�� �Ѵ�.
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
