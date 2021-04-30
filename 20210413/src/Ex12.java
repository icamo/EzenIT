
public class Ex12 {

	public static void main(String[] args) {
		// do ~ while
		int num1,num2, num3, num4, num5, num6;
		num1 =(int)(Math.random() * 45) + 1; // (0 ~ 44) + 1
		do {
			num2 =(int)(Math.random() * 45) + 1; 
		}while(num1 == num2);
		do {
			num3 = (int)(Math.random() * 45) + 1;
		}while(num1 == num3 || num2 == num3);
		do {
			num4 = (int)(Math.random() * 45) + 1;
		}while(num4 == num1|| num4 == num2 || num4 == num3 );
		do {
			num5 = (int)(Math.random() * 45) + 1;
		}while(num5 == num4 || num5 == num3 || num5 == num2 ||
				num5 == num1);
		do {
			num6 = (int)(Math.random() * 45) + 1;
		}while(num6==num5|| num6==num4||num6==num3||num6==num2
				|| num6==num1);
		System.out.println(num1+","+num2+","+num3+","+num4+","
				+num5+","+num6);
	}
}
// for문으로 만든 로또 프로그램을 만들기