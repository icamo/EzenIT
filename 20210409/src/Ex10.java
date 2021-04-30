
public class Ex10 {

	public static void main(String[] args) {
		int num = 7;//(int)(Math.random() * 10) + 1;	
		switch(num) {
		case 1: System.out.println("1입니다."); break;
		case 2: System.out.println("2입니다."); break;
		case 3: System.out.println("3입니다."); break;
		case 4: System.out.println("4입니다."); break;
		case 5: System.out.println("5입니다."); break;
		case 6: System.out.println("6입니다."); break;
		default: System.out.println("7~10입니다.");
		}
		if(num == 1) {
			System.out.println("1입니다.");
		}else if(num == 2) {
			System.out.println("2입니다.");
		}else if(num == 3) {
			System.out.println("3입니다.");
		}else if(num == 4) {
			System.out.println("4입니다.");
		}else if(num == 5) {
			System.out.println("5입니다.");
		}else if(num == 6) {
			System.out.println("6입니다.");
		}else {
			System.out.println("7~10입니다.");
			System.out.println("자바가 재미있어요.");
		}
	}

}
