package package7;

import package6.Ex09;

public class Ex12 extends Ex09{
	public Ex12(String  field) {
		super();
		this.field = field;  // 부모 클래스로 부터 상속 받은 필드
	}
	public void print() {
		// 부모 클래스로 부터 상속 받은 필드  출력
		System.out.println(this.field);
		method();
	}
	
}
