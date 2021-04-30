public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동 형변환 
		byte b = 10;      // 00001010
		short s = b;      // 00000000 00001010
		int i = s;        // 00000000 00000000 
		                  // 00000000 00001010              
		long l = i;   
		// 작은 크기의 데이터를 큰 공간에 저장할 때 발생
		float f = 0.5f;
		double d = f;    // 자동 형변환
		f = i; 
		System.out.println(f);
		f = l;
		System.out.println();
		/// 실수는 정수보다 크다.
		// byte < short < int < long < float < double
		double e = 3e2; // 지수는 실수형으로만 저장할 수 있다.
		System.out.println(e);	
		// int i1 = 3e2;	
	}
}