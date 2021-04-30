
public class Ex18 {
	static int i;
	static double d;
	static String str;
	// 객체 생성시에 자동으로 실행되는 블럭
	static {
		i = 100;
		d = 10.5;
		str = "성남";
	}
	public void print() {
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}
