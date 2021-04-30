
public class Ex4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실수형 리터널 : 0.5, 10.6, 0.0
		// 소숫점을 가지고 있는 수를 실수라고 한다.
		float f; // 4byte : 정밀도가 낮음
		double d; // 8byte : 정밀도가 높음
		/// 실수는 8byte를 사용한다.
		System.out.println(10.5);
		f = 10.5f; // 8바이트 실수를 4바이트로 저장 
		d = 10.5;
		System.out.println(f);
		System.out.println(d);
		/// 정밀도 테스트
		f = 0.1234567890123456789f;
		d = 0.1234567890123456789;
		System.out.println(f);
		System.out.println(d);
		/// 정수는 int, 실수는 double을 많이 사용한다.
		/// e : 10, 3e6 3* (10의 6승): 1000000
		///         3e2 3 * (10의 2승) 300
		double i = 3e6;
		System.out.println(i);
		i = 3e2;
		System.out.println(i);
	}
}
