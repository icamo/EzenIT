
public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 번째입니다.");
		System.out.println("2 번째입니다.");
		System.out.println("3 번째입니다.");
		System.out.println("4 번째입니다.");
		
		for(int i = 1; i <= 4;i++) {
			System.out.println(i + " 번째입니다.");
		}
		
		System.out.println("==============================");
		// 4단출력
		for(int i = 1 ; i<=9; i++) {
			System.out.println(" 4 * " + i + " = " + 4*i);
		}
		// 5단출력
		for (int i = 1; i <= 9; i++) {
			System.out.println(" 5 * " + i + " = " + 5 * i);
		}
		// 6단출력
		for (int i = 1; i <= 9; i++) {
			System.out.println(" 6 * " + i + " = " + 6 * i);
		}
		
		System.out.println("===========================");
		for(int j = 4 ; j <= 6; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println( j +"  * " + i + " = " + j * i);
			}
		}
	}
}
