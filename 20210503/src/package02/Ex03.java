package package02;

public class Ex03 {

	public static void main(String[] args) {
		
		//Wrapper 자료형 : 기본 자료형을 문자열로 변환하고 문자열도 기본 자료형으로 변환이 가능하도록 하기 위한 자료형
		int i = 10;
		Integer i1 = 10;
		short s = 10;
		Short s1 = 10;
		byte b = 12;
		Byte b1 = 12;
		long l = 10L;
		Long l1 = 10L;
		float f = 3.14F;
		Float f1 = 3.14F;
		double d = 3.14;
		Double d1 = 3.14;
		boolean bl = false;
		Boolean bl1 = false;
		
		Integer i2 = 100;	// 박싱		Wrapper자료형 = 기본자료형;
		int i3 = i2; 		// 언박싱		기본자료형 = Wrapper자료형;
		
		//Wrapper자료형은 null값을 저장하기 위해 사용한다.
		//문자열을 기본 자료형으로 변환하기 위해 사용한다.
		i2 = null;
		
		
	}

}
