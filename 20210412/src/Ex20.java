
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100가지의 홀수의 합을 구하시오.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println( i + "는 짝수입니다.");
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		// 짝수의 합을 구하시오.
		sum = 0;
		for(int i = 0; i <= 100 ; i++) {
			if(i % 2 != 0) {
				System.out.println(i + "는 홀수입니다.");
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		// 홀수의 합을 구하시오.
		sum = 0;
		int i = 0;
		while (i <= 99) { // 99
			i++; // 100 // 101
			if(i % 2 == 0 ) {
				continue;
			}
			sum += i;
			 // 2
		}
		System.out.println(sum);
		// 1 ~ 10출력하시오. while	
		int i1 = 0; 
		while (i <= 9) {
			i++;
			System.out.println(i);
		}
		i1 = 0;
		while (i < 10) {
			i++;
			System.out.println(i);
		}
		
	}
}
