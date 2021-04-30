
public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이중 반복문
		/*
		for(){
			for(){
			}
		}
		*/
		// 4단 출력 , 5곱 ~ 8곱
		for(int i = 5; i <= 8 ; i++) {
			System.out.println("4 * " + i + " = " + 4 * i);
		}
		// 5단 출력 , 5곱 ~ 8곱
		for(int i = 5; i <= 8 ; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
		// 6단 출력 , 5곱 ~ 8곱
		for (int i = 5; i <= 8; i++) {
			System.out.println("6 * " + i + " = " + 6 * i);
		}
		System.out.println("================");
		
		for(int j = 4; j <= 6; j++) {
			for (int i = 5; i <= 8; i++) {
				System.out.println( j + " * " + i + " = " + j * i);
			}
		}
		
		
		System.out.println("1 번째입니다.");
		System.out.println("2 번째입니다.");
		System.out.println("3 번째입니다.");
		System.out.println("4 번째입니다.");
		
		for(int i = 1; i <= 4; i++) {
			System.out.println(i + " 번째입니다.");
		}
	}

}
