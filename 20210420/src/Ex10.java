
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = add(5, 4); // 호출 메서드
		System.out.println(i);
		sum(43, 5);
		i = add(); // 매개변수가 없으면 값을 전달 할 수 없다.
		System.out.println(i);
		sum();
	}
	// 오버로딩 : 매개변수의 갯수나 순서 또는 타입다른 경우 
	//  메서드의 종류는 4가지가 있다
	// 1. 매개변수가 있고 반환값도 있는 메서드
	///         리턴타입             매개변수
	public static int add(int num1, int num2) { // 피호출 메서드
		int result;
		result = num1 + num2;
		return result;
	}
	// 2. 매개변수는 있고 반환 값이 없는 함수
	public static void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	// 3. 매개변수 없고 반환값이 있다.
	//          리턴타입    매개변수(x)
	public static int add() {
		int  num1 =  10;
		int num2 = 20;
		int result = num1 + num2;
		return result;
	}
	// 4. 매개변수없고 반환값도 없는 메서드
	public static void sum() {
		int  num1 =  10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.println(result);
	}

}
