public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 강제 형변환
		int i = 10; 
		// 00000000 00000000 00000000 00001010
		//              65536
		short s  = (short)i; // 00000000 00001010
		System.out.println(s);
		// 00000000 00000001 00000000 00000001 :65537 
		i = 65537;
		s = (short)i; // 00000000 00000001
		System.out.println(s);
		// 크기 큰 값을 작은 크기로 변환하는 것을 강제형변환이라고 한다.
		// 값이 잘리는 경우가 발생하여 다른 값을 가져올 수 있다.
		
		float f = 15.5f;
		int  i1 =  (int)f; 
		// 실수를 정수로 강제형변환을 하면 정수값만 저장이 된다.
		System.out.println(i1);
		
	}
}
