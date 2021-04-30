public class Ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// 정수 : 10, 실수 :10.5 , 문자 : 'a', 문열형 "a", 논리:true
		int i = 10;
		System.out.println(i); // 10
		String str = "10";
		System.out.println(str); // 10
		char ch = 65; // 문자형 변수라고도 한다.
		char ch1 = 'A';
		System.out.println(ch); // 'A'
		System.out.println(ch1); // 'A'
		int i1 = ch1;
		System.out.println(i1); // 65
		long l = 10; // -2,100,000,000 ~ 2,100,000,000
		System.out.println(l);
		long l1 = 10000000000L;
		System.out.println(l1);
		/// 정수형 변수에 대한 설명 끝
		/// 실수형 변수 : 10.5 // 8byte
		float f = 10.5f ; // 4byte
		double d = 10.5; // 8byte
		System.out.println(f);
		System.out.println(d);
		f = 0.1234567890123456789f;
		d = 0.1234567890123456789;
		System.out.println(f);
		System.out.println(d);
		double d1 = 12345; // 0.12345 * e5 : e는 10을 의미한다.00
		double d2 = 3e5;
		System.out.println(d2);
		d2 = 0.1235;
		//// 논리형 데이터 : true, false
		boolean b = true;
		boolean b1 = false;
		String str1 = "true";
		System.out.println(b); // 논리형
		System.out.println(str1); // 문자열형
		/// 리터널 : 정수, 실수, 문자, 문자열, 논리
		/// 자료형 : 정수 : int, long, char
		///        실수 : float, double
		///        문자 : char
		///        문자열 : String
		///        논리 : boolean
		/// Promotion : 자동형변환 
		/// byte < short < int < long < float < double
		short s = 10;
		int i3 = s; // 자동형 변환
		float f1 = i3; // 자동형변환
		int i4 = 1234546780;
		float f2 = i4; // 0.1234546780 * e10
		int i5 = (int)f2;
		System.out.println(i5);
		
		int i6 = 129;
		byte s3 = (byte)i6; // 큰 자료형을 작은 자료형으로 변환하는 것 
		                    // 강제형변환
		System.out.println(s3);
		int i7 = 2000000000;
		int i8 = 2000000000;
		int i9 = i7 + i8;
		long l3 = i7 + i8; 
		System.out.println(i9);
		System.out.println(l3);
		long l4 = (long) i7 + (long)i8;
		System.out.println(l4);
		long l5 = (long) i7 + i8; // 65행과 같은 의미 
		System.out.println(l5);
	}
}