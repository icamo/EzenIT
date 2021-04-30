
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		// i가 1, 4일때 i가 2, 5일때, i가 3, 6일때
		if (i == 1 || i == 4) {
			System.out.println("1이거나 4입니다.");
		}else if(i == 2 || i == 5) {
			System.out.println("2이거나 5입니다.");
		}else if(i == 3|| i == 6) {
			System.out.println("3이거나 6입니다.");
		}
		System.out.println("if 문을 switch문으로 변경 ");
		switch(i) {
		case 1 :
		case 4 :
				System.out.println("1이거나 4입니다.");
		        break;
		case 2 :
		case 5 :
				System.out.println("2이거나 5입니다.");
				break;
		case 3 :
		case 6 :
				System.out.println("3이거나 6입니다.");
		}
	}

}
