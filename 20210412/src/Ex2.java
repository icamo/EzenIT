
public class Ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		if(num == 1) {
			System.out.println("1입니다.");
		}else if(num == 2) {
			System.out.println("2입니다.");
		}else if(num == 3) {
			System.out.println("3입니다.");
		}
		System.out.println("==== switch ======");
		switch(num) {
		case 1: System.out.println("1입니다.");
		        break;
		case 2 : System.out.println("2입니다.");
		        break;
		case 3 : System.out.println("3입니다.");
		}
	}
}
