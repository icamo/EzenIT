package package05;

public class Ex26 implements Ex25{
	// 추상메서드 재정의 
	@Override
	public void method1(int dante) {
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dante + " * " + gop + " = " + dante * gop);
		}
	}
}
