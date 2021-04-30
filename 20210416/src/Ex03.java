
public class Ex03 {
	// 멤버 필드는 값이 저장되지 않으면 기본값으로 초기화가 되어 있다.
	int i;
	long l;
	float f;
	double d;
	boolean b;
	String str;
	
	/*
	 * public Ex03(){}  // default 생성자
	 * 만들어 주지 않아도 클래스에 존재하는 생성자.
	 */
	public void print() {
		System.out.println("정수형 멤버 필드 : " + i);
		System.out.println("long형 멤버 필드 : " + l);
		System.out.println("float형 멤버 필드 : " + f);
		System.out.println("doube형 멤버 필드 : " + d);
		System.out.println("boolean형 멤버 필드 : " + b);
		System.out.println("문자열형 멤버 필드 : " + str);
	}
}