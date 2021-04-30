
public class Ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 3;
		int k = i % j ;
		System.out.println(k); // 나머지
		k = i / j;
		System.out.println(k);
		double d = (double)i / j ;
		System.out.println(d);
		
		char ch = 'A' + 1;// 리터널값을 변수에 저장할 경우 크기를 넘지 않으면 됨
		System.out.println(ch);
		char ch1 = 'B';
		///char ch2 = ch1 + 1;  // 4byte + 4byte
		int ch2 = ch1 + 1;
		System.out.println(ch2);
		char ch3 = (char)(ch1 + 1);
		System.out.println(ch3);
		//ch3 = (char)ch1 + 1; // 2byte + 4byte => 4byte + 4byte
		//ch3 = ch1 + (char)1;
	}
}
