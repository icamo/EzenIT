package package01;

public class Ex02Test {

	public static void main(String[] args) {
		Ex04 ex4 = new Ex04();
		ex4.setUserId("�̼���");
		System.out.println(ex4.getUserId());
		
		Ex04 ex5 = new Ex04();
		ex5.setUserId("�̻��");
		System.out.println(ex5.getUserId());

		Ex04 ex6 = new Ex04();
		ex6.setUserId("�����");
		System.out.println(ex6.getUserId());

		
		Ex04 ex7 = new Ex04();
		ex7.setUserId("�̻�"); // ��ü���� ��ü ������ this�� ǥ��

		Ex02 ex1 = new Ex02("high1");
		Ex02 ex2 = new Ex02("high2");
		Ex02 ex3 = new Ex02("high1");	
		// �ּҺ���, ��������, ��ü����
		ex1.equals(ex2);
		
	}
}