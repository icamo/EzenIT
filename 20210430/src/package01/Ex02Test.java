package package01;

public class Ex02Test {

	public static void main(String[] args) {
		Ex04 ex4 = new Ex04();
		ex4.setUserId("이숭무");
		System.out.println(ex4.getUserId());
		
		Ex04 ex5 = new Ex04();
		ex5.setUserId("이상범");
		System.out.println(ex5.getUserId());

		Ex04 ex6 = new Ex04();
		ex6.setUserId("이장범");
		System.out.println(ex6.getUserId());

		
		Ex04 ex7 = new Ex04();
		ex7.setUserId("이상무"); // 객체명은 객체 내에서 this로 표현

		Ex02 ex1 = new Ex02("high1");
		Ex02 ex2 = new Ex02("high2");
		Ex02 ex3 = new Ex02("high1");	
		// 주소변수, 참조변수, 객체변수
		ex1.equals(ex2);
		
	}
}