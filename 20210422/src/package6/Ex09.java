package package6;

// protected는 패키지가 다르면 사용할 수 없으므로 사용하고 싶은 경우에는 상속을 해주면 된다.
public class Ex09 {
	protected String field;
	protected Ex09() {
	}
	protected void method() {
		System.out.println("상속된 부모 메서드 실행");
	}
}
