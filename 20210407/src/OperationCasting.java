
public class OperationCasting {
	public static void main(String [] args) {
		short s = 10; //                   00000000 00001010
		int i = 65537;// 00000000 00000001 00000000 00001010
		int i1 = s + i; // 2byte + 4byte
		                // 4byte + 4byte (자동 형변환)
					    //00000000 00000000 00000000 00001010
		                //00000000 00000001 00000000 00000001
		/// 연산식에서의 자동 형변환
		System.out.println(i1);
		int i2 = 10;
		double d = 170.5;
		double d1 = i2 + d; // 4byte + 8byte
		                    // 8byte(실수로 변환) + 8byte 
		System.out.println(d1);
		
		// 정수는 4byte로 연산
		System.out.println(10 + 20);
		
		byte b = 10;
		byte b1 = 20; 
		int b2 = b + b1; // 1byte + 1byte(x)
		                 // 4byte + 4byte
                       //  1111111

		System.out.println(b2);
		short s1 = 10;
		short s2 = 20; // 2byte + 2byte => 4byte + 4byte
		int i3 = s1 + s2;
		
		float f1 = 10.5f;
		float f2 = 20.5f;
		float d2 = f1 + f2;
		System.out.println(d2);
		double d3 = f1 + 100.5;   // 4byte + 8byte
		                          // 8byte + 8byte
		System.out.println(d3);
		int x,y,z;
		x = y = z = 10;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);	
	}
}
//// 2장
/// 자료형 : 
///정수 : 10  int, long (L) : 4byte
///실수 : 10.5 float(f), double : 8byte
///문자열 : "10", "a", "true" : String
///문자 : 'a' : char : unicode char c  = 'A'; c = 65;
///논리 : true, false boolean
///형변환 : 자동형변환 : byte<short<int<long<float<double
///                큰 자료형 = 작은 자료형
///       강제형변환 : 작은 자료형 = (작은 자료형)큰 자료형
///       연산식 자동형변환 : 작은형 자료형과 큰자료형이 연산을 할 때
///                      작은 자료형이 큰 자료형으로 변환






