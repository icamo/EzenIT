
public class Ex2 {
	public static void main(String [] args) {
		//int i ; 초기화가 되지 않아 오류가 발생할 수 있다.
		int i = 10; // 변수의 초기화
		// 변수 선언과 동시에 값을 주면 초기화
		int result = i + 1;
		System.out.println(result);
		int j;
		j = 10; // 변수 선언 후 값을 주면 대입 
		System.out.println(j);
	}
}
