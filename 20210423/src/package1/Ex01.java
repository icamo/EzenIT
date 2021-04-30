package package1;

public class Ex01 {
	public static void main(String [] args) {
		/// 자동 형변환 :
		/// byte => short => int =>long =>float => double
		byte b = 1;
		int i = b;
		System.out.println(b);
		// 큰 자료형 = 작은 자료형 // 큰자료형에 작은 자료형을 대입하는 것을 자동형변환
		
		/// 강제 형변환 
		/// double => float => long => int => short => byte
		/// 작은 자료형  = (작은 자료형)큰 자료형;
		double d = 10.5;
		System.out.println(d);
		i = (int)d; // 강제형변환
		System.out.println(i);
	}
}