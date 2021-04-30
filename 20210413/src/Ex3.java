
public class Ex3 {

	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 3;
		sum = sum + 5;
		sum = sum + 7;
		sum = sum + 9;
		System.out.println("1 ~ 10중 홀수의 합 : " + sum);
		System.out.println("==================================");
		// 1 ~ 10까지 홀수의 합을 구하시오 
		int i;
		sum = 0;
		for(i = 1; i <= 10; i+=2) {
			sum = sum + i;
		}
		System.out.println("1 ~ 10중 홀수의 합 : " + sum);
		System.out.println("==================================");
		// continue
		sum = 0;
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 0) { continue; }
			sum = sum + i;
		}
		System.out.println("1 ~ 10중 홀수의 합 : " + sum);
		System.out.println("==================================");
		//continue를 제외 if문만 사용
		sum = 0;
		for(i = 1 ; i <= 10; i++) {
			if(i % 2 !=0) {
				sum = sum + i;
			}
		}
		System.out.println("1 ~ 10중 홀수의 합 : " + sum);
		System.out.println("==================================");
		sum = 0;
		sum = sum + 10;
		sum = sum + 20;
		sum = sum + 30;
		sum = sum + 40;
		sum = sum + 50;
		sum = sum + 60;
		sum = sum + 70;
		sum = sum + 80;
		sum = sum + 90;
		sum = sum + 100;
		System.out.println("1 ~ 100중 10의 배수의 합 : " + sum);
		System.out.println("==================================");
		
		sum = 0;
		for(i = 10; i <= 100; i++) {
			if(i % 10 != 0) { continue; }
			sum = sum + i;
		}
		System.out.println("1 ~ 100중 10의 배수의 합 : " + sum);
		System.out.println("==================================");
		sum = 0;
		for(i = 10; i <= 100; i++) {
			if(i % 10 == 0) { sum = sum + i; }
		}
		System.out.println("1 ~ 100중 10의 배수의 합 : " + sum);
		System.out.println("==================================");
		sum = 0;
		for(i = 10; i <= 100; i+=10) {
			sum = sum + i;
		}
		System.out.println("1 ~ 100중 10의 배수의 합 : " + sum);
		System.out.println("==================================");
		
		
		
	}

}
