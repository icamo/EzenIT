
public class Ex04 {

	public static void main(String[] args) {
				
		int result = add(4, 5);
		System.out.println(result);
		
		String fullName = name("����","��");
		System.out.println(fullName);
		
		double circle = area(5, 3.14);
		System.out.println(circle);
		
		int rangle = rangleArea(4, 3);
		System.out.println(rangle);
		
		System.out.println("==========");
		
		
	}
	
	
	// static�޼��忡�� �޼��带 ȣ���Ϸ��� static�޼����̾�� �Ѵ�. (��ü �̻�����)
	// �޼����� 4���� ����
	// �⺻ �޼��� : �Ű������� �ְ� ��ȯ���� �ִ� �޼���
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
