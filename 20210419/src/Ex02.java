
public class Ex02 {
	public static void main(String[] args) {
		// �޼��尡 �ʿ��� ����

		// 4��
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println("4 * " + gop + " = " + 4 * gop);
		}

		// 5��
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println("5 * " + gop + " = " + 5 * gop);
		}

		// 6��
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println("6 * " + gop + " = " + 6 * gop);
		}
		
		System.out.println("==========");
		
		for (int dan = 4; dan <= 6; dan++) {
			for (int gop = 1; gop <= 9; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
		
		System.out.println("==========");		
				
		gugu(4); gugu(5); gugu(6);
		
				
	}
	
	public static void gugu(int dan) {
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
	}
	
	// �޼����� ����
	// 1. ���� �����Ѵ�.
	// 2. ���� �޾ƿ´�.
	// 3. �ݺ����� �ڵ带 �� ���� �����ؼ� ����� �� �ִ�.
	
	
}
