
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random() *3) +1;
		int num2;
		do {
			num2 = (int)(Math.random() *3) +1;
		}while(num1 == num2);
		// do~while 은 
		// 명령문이 먼저 실행한 후에 비교를 해야 하는 경우에 사용
		
		// 제어문 : 조건문 , 반복문
		// 조건문 : if , if~else, if ~ else if, switch(=)
		// 반복문 :  for, while, do~while, 
		// 반복문을 제어 : break, continue
	}
}
