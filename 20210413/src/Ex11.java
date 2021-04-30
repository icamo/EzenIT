
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i = 1; i<= 10; i++) {
			System.out.println(i);
		}
		System.out.println("=======================");
		i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("============================");
		i = 1;
		int j = 15;
		while (true) {
			System.out.println(i);
			if(i == j) {break;}
			i++;
		}
	}

}
