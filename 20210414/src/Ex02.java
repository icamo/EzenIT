
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언 방법
		int i [] = {1,2,3,4,5};
		int i1 []; // stack   i1 : null
		i1 = new int[] {1,2,3,4}; // heap  : 배열이 만들어짐 : 
		                          // i1 = heap영역의 주소
		    // new 연산자 : heap영역에 영역할당 
		int i2[] = new int[5]; // 배열의 크기 5 : index 0,1,2,3,4
		                       // heap영역에 영역만 할당 받음
		// heap영역에 있는 배열에 데이터를 저장
		i2[0] = 1;
		i2[1] = 2;
		i2[2] = 3;
		i2[3] = 4;
		i2[4] = 5;
		//i2[5] = 6;(x)
		for(int j = 0; j <= 4; j++) {
			System.out.println(i2[j]);
		}
		System.out.println("배열 i2의 크기 : " + i2.length); // 5
		// 배열명.length : 배열의 크기 
		int i3[];
		i3 = new int[4];
		i3[0] = 1;
		i3[1] = 2;
		i3[2] = 3;
		i3[3] = 4;
		/// 배열의 크기 확인
		System.out.println(i3.length); // 4
		for(int j = 0; j < i3.length; j++) {
			System.out.println(i3[j]);
		}	
	}
}
