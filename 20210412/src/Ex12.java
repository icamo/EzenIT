
public class Ex12 {
	int i ; // 클래스변수
	
	public static void main(String[] args) { // 메서드
		// TODO Auto-generated method stub
		for(int i = 1 ; i <= 10; i ++) {
			// for문 안에서 선언된 변수는 for문 안에서만 사용 가능하고 밖에선 사용할 수 없다.
			// 지역변수
			System.out.println(i);
		}
		//System.out.println(i);
		/* 같은 변수를 반복적으로 선언 할 수 없다.
		int j = 0;
		int j = 1;
		*/
		int i = 0; // 메서드 변수
		/*
		int k = 0; // 메서드변수가 있는 경우 같은 이름의 지역변수를 선언 할 수 없다.
		for(int k = 1; k <= 10; k ++) {
			System.out.println(k);
		}
		*/
		
		int l; // 반복문 밖에서 선언된 변수는 반복문안에서도 사용가능하다.    
		for(l = 1; l <= 10; l++) {
			System.out.println("aaaa " + l);
		}
		System.out.println(l);// 그리고 계속 반복문 밖에서 사용된다.
	}

}
