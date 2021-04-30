package package2;

public class Ex11 implements Ex09 {
	int num3;
	int num4;

	public void add() {
		System.out.println(num3 + num4);
	}

	public void sub() {
		System.out.println(num3 - num4);
	}

	@Override
	public void mul() {
		System.out.println(num3 * num4);
	}

	@Override
	public void div() {
		if (num4 == 0) {
			System.out.println("ºÒ´É");
		} else {
			System.out.println((double)num3 / num4);
		}
	}
}