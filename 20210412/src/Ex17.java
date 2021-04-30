
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		#나무를 1번 찍었습니다.
		#나무를 2번 찍었습니다.
		#나무를 3번 찍었습니다.
		#나무를 4번 찍었습니다.
		#나무를 5번 찍었습니다.
		#나무를 6번 찍었습니다.
		#나무를 7번 찍었습니다.
		#나무를 8번 찍었습니다.
		#나무를 9번 찍었습니다.
		#나무를 10번 찍었습니다.
		  나무가 넘어갑니다.
		  */
		//while문으로 작성
		int i = 1;
		while(i <= 10) {
			System.out.println("나무를 "+ i +"번 찍었습니다.");
			i++;
		}
		// 1부터 100까지 더하시오.
		int sum = 0;
		for(int j = 1 ; j <= 100; j++) {
			sum += j;
		}
		System.out.println(sum);
		sum = 0;
		int j = 1;
		while(j <= 100) {
			sum += j;
			j++;
		}
		System.out.println(sum); // 5050
		/// 1~100까지 중 홀수만 더하시오
		sum = 0;
		for(i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("for " + sum);
		
		sum = 0; 
		i = 0;
		while (i <= 99) {
			i++;
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			sum += i;
		}
		System.out.println("while " + sum);
	}

}
