package packageTest1;

import packageTest.Ex11;
// 서로 다른 패키지에서 접근지정자 사용
public class Ex12 {
	public static void main(String [] args) {
		Ex11 ex = new Ex11();
		// ex.num = 10; private이므로 사용할 수 없다.
		// ex.pi = 3.141592; 
		// protected는 다른 패키지 내에서는 사용할 수 없다.
		ex.name = "이숭무"; // public은 어디서든지 사용가능
	}
}