package package9;

public class ChildTest {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent =  child;
		parent.method1();
		parent.method2();
		// parent.method3();
		// 자동 형 변환을 했을 때 자식이 가지고 있는 메서드는 부모가 사용할 수 없다.
		

	}

}
