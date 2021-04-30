
public class Ex17 {
	
	int field;
	// 정적 변수 초기화
	// 정적변수를 초기화하는 방법은 static블럭을 이용하거나 static메서드를 이용
	static int field2;
	
	public Ex17(int field, int field2) {
		// 인스턴스 변수나 정적 변수 모두 초기화가 된다.
		this.field = field;
		this.field2 = field2;
	}
	static {
		// field = 10; 인스턴스변수는 static블럭에서 초기화를 할 수 없다.
		field2 = 10; // 정적변수만 초기화가 된다.
	}
	static void setValue(int field, int field2) {
		//this.field = field;
		// 인스턴스 변수는 static메서드에서는 초기화가 되지 않는다.
		field2 = field2; //static 변수는 인스턴스 변수가 아니므로 this사용(x)
		// 정적 메서드 안에서는 정적변수만 초기화된다.
	}
	void setField(int field) {
		this.field = field;
		this.field2 = field2;
	}
	public void getValue() {
		System.out.println("field : " + field);
		System.out.println("field2 : " + field2);
	}
}
