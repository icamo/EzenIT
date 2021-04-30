package package06;

public class Ex30 extends Ex29 {

	@Override
	void method1(int dante) { // 추상 메서드
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dante + " * " + gop + " = " + dante*gop);
		}
	}
	
}
