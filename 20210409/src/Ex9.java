
public class Ex9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;
		// 90~ 94까지는 A, 95~100 까지는 A+
		if(score >= 95) {
			System.out.println("A+");
		}else if(score >= 90) {
			System.out.println("A");
		}
		System.out.println("======switch=======");
		switch(score) {
		case 100: 
		case 99:
		case 98:
		case 97:
		case 96:
		case 95: System.out.println("A+");
				 break;
		case 94:
		case 93:
		case 92:
		case 91:
		case 90: System.out.println("A"); break;
		}
	}
	
}