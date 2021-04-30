
public class Ex2 {

	public static void main(String[] args) {
		int i1 ;
		i1 = 10;
		System.out.println(i1);
		// 피연산자 : 리터널,  리터널값을 가지고 있는 변수
		// 연산자  : 피연산자를 연산하기 위한 기호 (+,-,*,/,...)
		// 연산식 : 피연산자와 연산자를 계산하기 위해서 묶어 놓은 것
		//         10 + 20 : 연산식
		// 이항 연산자 :  피연산자 + 피연산자 : 피연산자가 두개가 있는 경우
		//           산술 연산자 (+, -, *, /, %)
		// 나머지 연산자 (%)
		int x = 10;
		int y = 3;
		int result = x % y; // x피연산자 % y피연산자
		System.out.println(result);	
		// 나머지연산자로 할 수 있는 문제? 배수를 알고 싶을 때
		int z = 12; // 3배수인지 확인 
		result = z % 3;
		System.out.println(result); // 나머지가 0이면 배수이다.
		result = z % 4; // 4의 배수이면 나머지가 0이다.
		System.out.println(result);
		
		///        문자열 연결 연산자 (+)
		String str = "hello " + "java";
		System.out.println(str);
		String str1 = "hello";
		String str2 = "java";
		str = str1 + " " + str2; // " " :공백문자
		System.out.println(str);
		result = z % 3;
		System.out.println("result가 0이면 3의 배수이다. result = " + result);
		str = "3 * 7 = " + 21;
		System.out.println(str);
		/// 대입연산자 (= , +=, -=, *= , -=, %=)
		int i2, i3, i4, i5;
		i2 = i3 = i4 = i5 = 20;
		System.out.println("i2 = " + i2);
		i2 += 2 ; // i2 = i2 + 2;
		System.out.println("i2 = " + i2);
		i2 -= 1; //i2 = i2 - 1;
		System.out.println("i2 = " + i2);
		i2 *= 2; // i2 = i2 * 2;
		System.out.println("i2 = " + i2);
		i2 /= 2; // i2 = i2 / 2;
		System.out.println("i2 = " + i2);
		i3 %= 3; // i3 = i3 % 3;
		System.out.println("i3 = " + i3);
		
		// 비교 연산자 : <, >, <=, >=, == , != 
		// 비교연산자의 결과값은 true / false
		boolean b = i4 == i5;
		System.out.println(b);
		b = i2 > i3;
		System.out.println(b);
		b = i2 == i3;
		System.out.println(b); 
		b = i3 < i4;
		System.out.println(b);
		b = i3 != i4;
		System.out.println(b);
		/// 논리연산자  : 피연산자의 값은 true/false : &&, || 
		/// 논리연산의 결과 값은 boolean
		boolean b1 = true && true; // 불, 부울
		System.out.println(b1);
		b1 = true && false;
		System.out.println(b1);
		b1 = false  && true;
		System.out.println(b1);
		b1 = false && false;
		System.out.println(b1);
		
		int i11 =  10 + 10;
		double d1 =  10.5 + 10;
		
		b1 = true || true;
		System.out.println(b1);
		b1 = true || false;
		System.out.println(b1);
		b1 = false || true;
		System.out.println(b1);
		b1 = false || false;
		System.out.println(b1);
		
		// 논리 연산은 비교연산식의 결과가 논리값이므로 비교연산자를 
		//이용하여 논리연산을 한다.
		b1 = i2 > i3 && i3 == i4;
		System.out.println(b1);
		b1 = i2 > i3 || i3 == i4;
		System.out.println(b1);
	}
}
