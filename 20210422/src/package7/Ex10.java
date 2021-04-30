package package7;

import package6.Ex11;

public class Ex10 {
	public static void main(String [] args) {
		/*
		Ex09 ex = new Ex09(); // protected는 다른 패키지에서 사용할 수 없다.
		ex.field = 10;
		ex.method();
		*/
		Ex11 ex1 = new Ex11();
		ex1.field = "abcd";
		ex1.method();
		
		Ex12 ex2 = new Ex12("이숭무");
		// protected인 필드를 상속 받은 클래스 내에서는 사용할 수 있지만 외부에서는 사용 못함
		// ex2.field =  10;
		// ex2.method();
		ex2.print();
	}
}