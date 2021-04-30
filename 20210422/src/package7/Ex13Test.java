package package7;

public class Ex13Test {

	public static void main(String[] args) {
		// 기본 자료형에서의 자동 형변환
		// byte => short => int => long => float => double
		byte b = 1;
		short s = b; 
		int i = b ;
		long l = b;
		float f = b;
		double d = b;
		i = s;
		l = s;
		f = s;
		d = s;
		l = i;
		f = i;
		d = i;
		f = l;
		
	}

}
