
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3가지 영역
		// stack, heap, method 
		// stack : 변수 , 값
		// heap : 값
		int i = 10; // stack영역  i : 10
		int j = 20; // stack영역 j : 20
		double d = 10.5; // stack영역 d : 10.5
		String str = "이숭무"; // stack영역 str : 1000주소
		                     //  heap영역 : 이숭무 : 메모리 주소(예, 1000)
		String str1 = "이숭무"; // stack영역 str1 : 1000주소
		// 주소가 저장되는 변수를 주소변수 : 참조변수
		// 참조변수 : 문자열, 배열, 열거형
		int [] i1 = {1,2,3,4,5}; // stack영역  i1 : 2000주소
		                         // heap 1,2,3,4,5 : 2000
		System.out.println(i1);
		System.out.println(i1[0]); // 2000[0]
		System.out.println(i1[1]); // 2000[1]
		System.out.println(i1[2]); // 2000[2]
		
		
	}
}
