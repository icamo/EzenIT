package package03;

import package02.Ex10;

public class Ex11 {

	public static void main(String[] args) {
		// Object타입은 기본 자료형만이 아니라 모든 객체를 저장할 수 있는 타입이다. 
		Object obj = 10;
		Object obj1 = "이숭무";
		Object obj2 = 10.5;
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		Object ex = new Ex10();
		Ex10 ex10 = (Ex10)ex;
		ex10.gugu();		
	}

}
