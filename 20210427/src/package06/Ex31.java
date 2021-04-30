package package06;

public class Ex31 extends Ex29{

	@Override
	void method1(int dante) {
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dante + " * " + gop + " = " + dante * gop);
		}
	}
	@Override
	public void method2() { // 일반 메서드 재정의 
		int startDante = 4;
		int endDante = 8;
		for(int dante = startDante; dante<=endDante; dante++) {
			for(int gop = 1; gop <=9; gop++) {
				System.out.println(dante + " * " + gop + " = " + dante * gop);
			}
		}
	}

}
