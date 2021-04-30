
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5단을 출력하는데 홀수 곱만 출력
		System.out.println("5 * 1 = 5");
		System.out.println("5 * 3 = 15");
		System.out.println("5 * 5 = 25");
		System.out.println("5 * 7 = 35");
		System.out.println("5 * 9 = 45");
		
		System.out.println("반복문을 사용");
		for(int num = 1; num <= 9; num += 2) {
			System.out.println("5 * " + num + " = " + 5 * num);
		}
	}

}
