
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		//i = "10"; 문자열로 인식하므로 int 변수에 저장할 수 없다.
		String s  = "10";
		System.out.println(i); // 정수 10이 출력
		System.out.println(s); // 문자열 10이 출력
		char c = 65;// 0~65535 , unicode : 문자를 정수로 변환한 값
		System.out.println(c);
		c = 'D';
		System.out.println(c);
		int i1 = c;
		System.out.println(i1);
		i1 = 'D'; //(X)
		/// 'F'문자를 정수형 변수 i2에 저장하고 싶다.
		char c1 = 'F';
		int i2 = c1;
		System.out.println(i2);
	}
}