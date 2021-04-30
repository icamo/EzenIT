public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 일본, 영어 , 중국어, 한국, 숫자 : 자연어 : 
		// 리터널 : 정수 : 10, 20, 30, 1, 2
		//	           실수  : 10.5, 0.0 
		//        문자 : 'A' , 'a', ABC'(x)
		//        문자열 : "a", "abcd"
		
		System.out.println("10"); // 화면에 리터널을 출력
		System.out.println(10);
		System.out.println("Hello java");
		
		// 변수 : 리터널 값을 담을 수 있는 것
		// 자료형 : 리터널 별로 변수를 만들어 주기 위해서 .
		// 정수형 리터널 저장하기 위한 자료형 : 정수형 자료형
		// 정수형 자료형 : byte, char, short, int, long
		// 정수형 리터널 : 1,2,3,4,5,6,7,8,10,....
		byte b = 1;
		char c = 1; // char는 정수 리터널을 저장하지만 문자를 출력
		short s = 1;
		int i = 1;
		long l = 1;
		// l = 10.5;(x)
		System.out.println(b);
		System.out.println(c);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		// 실수형 리터널(0.0, 1.5, 175.3) 저장하기 위한 자료형  : 실수형 자료형
		// 실수형 자료형 : float, double
		float f = 10.5f;
		double d = 10.5;
		System.out.println(f);
		System.out.println(d);
		
		// 문자형 리터널 : 'A', 'B','c', 'v';
		// 문자형 리터널을 저장하기 위한 자료형 : 문자형 자료형 char
		char c1 = 65;
		char c2 = 'A';
		System.out.println(c1);
		System.out.println(c2);
		
		// 문자열형 리터널 : "abcdef", "이숭무" : 한글은 일반적으로 한 글자이어도 문자열로 취급
		// 문자열형 리터널을 저장하기 윈한 자료형 : 문자열 자료형 String
		String str = "hello java";
		String name = "이숭무";
		System.out.println(str);
		System.out.println(name);
		// 필요로 하는 값을 리터널이라고 하고 이러한 리터널을 저장하기 위해서 자료형을 만들어 
		// 자료형을 이용해서 리터널을 저장할 수 있게 선언 한 것을 변수

	// 자료형 변수명 = 리터널	
		int   i1  = 10; // 변수선언
		                //  변수 선언과 동시에 값을 초기화
		int i2; // 변수 선언
		i2 = 10;
		System.out.println(i1);
		System.out.println(i2);
		// i1, i2 : 변수명
		System.out.println(10);
		System.out.println("i3"); // 10, 0.0, 'A', "A"
		// System.out.println(i3); //  ""이 오없는 문자는 변수라고 인식 
		                           // 변수로 인식하기 위해서는 변수 선언을 해야 한다.
		// 변수명 만들기
		int i4;
		// int 1a; 변수명을 만들때 첫 글자가 숫자이면 안된다.
		//int #i; 변수명을 만들 때 첫 글자에 특수문자가 올 수 없다.
		int _i;
		int i_;
		int $i;
		int i$;
		//int if; // if, else ,...  예약어
		           // 예약어는 사용할 수 없다 
		String firstName; // 서로다른 변수
		String FirstName; // 서로다른 변수 
		// 변수명은 대소문자를 구분한다.
		// 단, 변수명의 첫글자는 소문자이어야 한다.
		// 단어가 두개 이상 붙어 있는 경우에는 다음 단어의 첫글자는 대문자이어야 한다.
		char ch1 = '가';  // 한글 2byte 
		System.out.println(ch1);
		// ""이 없는 문자는 모두 변수로 인식한다.
		int value;
		//int result = value + 1; // value에 값이 없어서 오류
		value = 10;
		int result = value + 1;
		System.out.println(result);
		
		// 논리형 리터널 : true, false
		// 논리형 리터널을 저장하기 위한 자료형 :boolean
		boolean bl = true; // 변수 선언
		System.out.println(bl);
		
		/// 리터널, 자료형, 변수, 변수선언

		/// 자동 형변환
		// 작은 자료형을 큰자료형에 대입하는 것을 말한다.
		// 변수가 선언되어 있으면 어디서든 사용이 가능하다.
		b = 100;
		System.out.println(b);
		s = b;
		System.out.println(s);
		// short : 2byte  = byte : 1byte
		i = s; // 자동형변환
		// int : 4byte = short : 2byte
		System.out.println(i);
		// byte < short < int < long < float < double : 자동형변환
		
		// 강제형변환
		// 큰 자료형을 작은 작은 자료형에 저장
		i = 100;
		b = (byte)i; // 큰 자료형에 작은 자료형을 적어주는 것을 강제형변환이라고 한다.
	}

}
