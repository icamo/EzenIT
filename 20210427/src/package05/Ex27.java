package package05;

public class Ex27 implements Ex25{
	// 추상메서드
	@Override
	public void method1(int dante) {
		int startGop =5;
		int endGop = 9;
		for(int gop = startGop; gop <= endGop ; gop++ ) {
			System.out.println(dante + " * " + gop + " = " + dante * gop);
		}
	}
	// 디펄트 메서드를 재정의
	@Override
	public void method2() {
		int startDante = 4 ;
		int endDante= 8;
		for(int dante = startDante ; dante <= endDante ; dante++) {
			for(int gop = 1; gop <= 9 ; gop++) {
				System.out.println(dante + " * " + gop + " = " + dante * gop);
			}
		}
	}
}
