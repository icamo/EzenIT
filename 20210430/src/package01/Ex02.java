package package01;

import java.util.Scanner;

public class Ex02 {
	// �ڷ��� ������ = ��;
/*	Scanner sc = new Scanner(System.in);
	int i = 10;
*/
	String id;
	public Ex02(String id) {
		this.id = id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	// ����ϰ� �ִ� ��ü�� �� Ŭ������ ����� ������ ��
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ex02) {
			Ex02 ex= (Ex02)obj;
			if(this.id.equals(ex.getId())) {
				return true;
			}else {
				System.out.println("�ٸ� ���Դϴ�.");
				return false;
			}
		}else { // ���� �ٸ� Ŭ������ ������� ��ü
			return false;
		}
	}
}




