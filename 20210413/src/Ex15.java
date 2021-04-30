
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1 = 83;
		int score2 = 90;
		int score3 = 83;
		int score4 = 90;
		int score5 = 83;
		int score6 = 90;
		int sum= 0; // score1 ~ score6까지 합을 구하기 위한 변수
		sum = sum + score1;
		sum = sum + score2;
		sum = sum + score3;
		sum = sum + score4;
		sum = sum + score5;
		sum = sum + score6;
		System.out.println(sum);
		
		int sum1 = 0; //score배열에 있는 요소의 합을 구하기 위한 변수
				// 자료형이 같은 여러개 데이터 저장하고 싶다.
		// 변수는 하나이지만 여러개의 데이터를 저장할 수 있으면 좋다. 배열
		int [] score = {10,20,30,40,50,60};
		int scr[] = {10, 20, 30};
		// 배열 안에 있는 각각의 값들을 요소라고 한다.
		// 각 요소는 고유의 번호를 0번부터 부여 받게 되는데 이 번호를index라고 한다.
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		for(int i = 0; i <= 5; i++) {
			sum1 = sum1 + score[i];
		}
		System.out.println(sum1);
		
		
		System.out.println(scr[0]);
		System.out.println(scr[1]);
		System.out.println(scr[2]);
		
		// 배열이란 같은 자료형의 데이터를 여러개 저장하기위해서 만든 것
		
		
	}
}
