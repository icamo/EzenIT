
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		System.out.println(sum);
		System.out.println("반복문으로 변경");
		sum = 0;
		for(int i = 1; i <= 10 ; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		/// 1~ 100까지의 합을 구하시오
		sum = 0;
		sum = sum + 1;
		// ...
		sum = sum + 100;
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
