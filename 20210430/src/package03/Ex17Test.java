package package03;

public class Ex17Test {

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		//            012345678
		// 3456
		System.out.println(str.substring(2, 2+4));
		int idx = str.indexOf("l");
		System.out.println(str.substring(idx, idx+4));
		
		// �����͵� ��ҹ��� ������.
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		
		String upperStr1 = str1.toUpperCase();
		String upperStr2 = str2.toUpperCase();
		System.out.println(upperStr1);
		System.out.println(upperStr2);
		
		String str3 = " �̼���";
		if(str3.trim().equals("�̼���")) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���.");
		}
		
		str3 = " �̼��� "; // �յ� ���鹮�ڸ� ����
		if(str3.trim().equals("�̼���")) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���.");
		}
		str3 = " �� ���� "; // �߰��� �ִ� ���鹮�ڴ� ���� ����� �ƴϴ�.
		if(str3.trim().equals("�̼���")) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���.");
		}
		str3 = " �� ���� "; // �߰��� �ִ� ���鹮�ڴ� ���� ����� �ƴϴ�.
		if(str3.trim().equals("�� ����")) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���.");
		}
		/*
		str3 = "1�̼���1";
		System.out.println(str1.trim('1'));
		*/
		
		int i = 10; //������ ���ڿ���\
		double d = 10.5; // �Ǽ��� ���ڿ���
		boolean b = true; // �ο�Ÿ���� ���ڿ���
		String i1 = "10"; // ���ڿ��� ����
		int res = Integer.parseInt(i1); // ���ڿ��� ����
		
		String result = String.valueOf(i);
		System.out.println(result);
		result = String.valueOf(d);
		System.out.println(result);
		result = String.valueOf(b);
		System.out.println(result);
		
	}
}
