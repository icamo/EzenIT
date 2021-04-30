
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while
		int sum = 0;
		for(int i = 1; i <= 100 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		int i = 1;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		sum = 0;
		i = 1;
		while (true) { // 무한 반복
			sum += i;
			i++;
			if(i == 101) break;
		}
		System.out.println(sum);
	}
}