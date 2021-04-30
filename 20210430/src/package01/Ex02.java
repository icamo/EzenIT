package package01;

import java.util.Scanner;

public class Ex02 {
	// 자료형 변수명 = 값;
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
	// 사용하고 있는 객체가 현 클래스로 만들어 졌는지 비교
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ex02) {
			Ex02 ex= (Ex02)obj;
			if(this.id.equals(ex.getId())) {
				return true;
			}else {
				System.out.println("다른 값입니다.");
				return false;
			}
		}else { // 서로 다른 클래스로 만들어진 객체
			return false;
		}
	}
}




