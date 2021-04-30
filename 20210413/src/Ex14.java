
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 리터널 : 자연어 , 한국어, 일본어, 영어,..., 숫자
		// 리터널 값을 저장 하기 위해서 자료형.
		// 정수형 리터널: 10, 1, 2,... 
		//            정수 자료형 : int , long
		// 실수형 리터널 : 0.5, 168.5
		//            실수형 자료형 : float, double
		// 논리형 리터널 : true, false
		//            논리형 자료형 : boolean
		
		/////// 기본 자료형: 실제 값을 간직하고 있는 자료형
		/// stack영역 데이터가 저장
		// stack 영역에 있는 데이터는 데이터 끼리의 비교가 가능하다.
		int i = 10; 
		double d = 10.5;
		boolean b = true;
		int j = 10;
		int k = 10;
		int l = 10;
		if(i == j) {
			System.out.println("같다.");
		}
		double d1 = 10.5;
		
		/// 선언된 변수는 모두 stack 영역에 만들어진다.
		/// 참조형 자료형 : 실제 값을 저장하고 있지 않다.
		/// 주소를 참조하게 된다. 주소 변수
 		// 문자열 리터널 : "이숭무"
		//            문자열 자료형 : String		
		String name1 = "신용권";
		String name2 = "신용권";
		/// 문자열 데이터는 heap영역에 데이터 들어간다.
		/// 변수는 stack 
		if(name1 == name2) {
			System.out.println("주소가 같다.");
		}
		// 참조형 자료형 : 문자열 자료형
		//             배열 자료형
		//             열거 자료형
		if(name1.equals(name2)) {
			System.out.println("데이터가 같다.");
		}
		
	}
}
