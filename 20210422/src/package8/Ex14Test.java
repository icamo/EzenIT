package package8;

public class Ex14Test {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		// 부모는 자식 객체를 참조 할 수 있다.
		A a = b;
		a = c;
		a = d;
		a = e;
		
		B b1 = new B();
		b  = d;
		C c1 = new C();
		c1 = e;
	}

}
