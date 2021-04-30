
public class Ex23 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		// TODO Auto-generated method stub
		// 1.while   6단 출력
		while (i < 9) {
			i++;
			System.out.println(" 6 * " + i + "=" + 6 * i);
		}
		// 2. while  6단 출력 (홀수 만 출력) continue(X)
		i = 0;
		while (i < 9) {
			i++;
			if(i % 2 != 0) {
				System.out.println(" 6 * " + i + "=" + 6 * i);
			}
		}
		// 3. while  6 단 출력(짝수 만 출력) continue (X)
		i = 0;
		while (i < 9) {
			i++;
			if(i % 2 == 0) {
				System.out.println(" 6 * " + i + "=" + 6 * i);
			}
		}
		// 4. while  6단 출력 (홀수 만 출력) continue 
		i = 0;
		while (i < 9) {
			i++;
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(" 6 * " + i + "=" + 6 * i);
		}
		// 5. while  6 단 출력(짝수 만 출력) continue
		i = 0;
		while (i < 9) {
			i++;
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(" 6 * " + i + "=" + 6 * i);
		}
		// 6. while  1 ~ 100 까지 출력 하는 데 4의 배수만 continue(X)
		i = 0;
		while (i < 100) {
			i++;
			if(i % 4 == 0) {
				System.out.println(i);
			}
		}
		// 7. while  1 ~ 100 중 4의 배수의 합을 구하시오. continue(X)
		i = 0;
		sum = 0;
		while (i <= 99) {
			i++;
			if(i % 4 == 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		// 8. while  1 ~ 100 까지 출력 하는 데 4의 배수만 continue
		i = 0;
		while (i < 100) {
			i++;
			if(i % 4 != 0) {
				continue;
			}
			System.out.println(i);
		}
		// 9. while  1 ~ 100 중 4의 배수의 합을 구하시오. continue
		i = 0;
		sum = 0;
		while (i <= 99) {
			i++;
			if(i % 4 != 0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
		// 10.while  1 ~ 100 중 4의 배수가 아닌 수의 합을 구하시오. continue
		i = 0;
		sum = 0;
		while (i <= 99) {
			i++;
			if(i % 4 == 0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);		
	}
}
