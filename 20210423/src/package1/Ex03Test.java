package package1;

public class Ex03Test {

	public static void main(String[] args) {
		Ex03 ex = new Ex03();
		ex.method1(); // Ex02로 부터 상속 받은 메서드
		ex.method2(); //
		ex.method3(); // Ex03의 메서드
		ex.field1 = "부모 필드"; // Ex02로 부터 상속 필드
		System.out.println(ex.field1);
		ex.field2 = "자식 필드";
		System.out.println(ex.field2); // 자신의 필드
		
		Ex02 ex1 = new Ex02();
	}

}
