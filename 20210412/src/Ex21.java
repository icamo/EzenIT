
public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 부터 100까지 출력하시오 while
		int i = 0;
		while (i < 100) { // i <= 99
			i++;
			System.out.println(i);
		}
		// 3부터 95까지 출력하시오.
		i = 2;
		while (i <= 94) {
			i++;
			System.out.println(i);
		}
		// 1부터 100중 3의 배수만 출력하시오.while
		i = 0;
		while(i <= 99) {
			i++;
			if(i % 3 != 0) {
				continue;
			}
			System.out.println(i);
		}
		i = 0;
		while (i <= 99) {
			i++;
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		// while 문을 이용해서 4배수만 출력하시오. 1부터 100까지 
		i = 0;
		while (i <= 99) {
			i++;
			if(i % 4 == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
