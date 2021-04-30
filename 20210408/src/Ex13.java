
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 2000;
		if (money >= 3000) { // 참인 결과가 와야 실행
			System.out.println("택시를 타고 가시오.");
		}else { // if문에 있는 조건의 결과가 false가 오면 실행
			System.out.println("걸어가시오.");
		}
		
		int score = 78; // 60점 이상 합격, 60점 미만이면 불합격
		if(score>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		char gender = 'M';
		if (gender == 'F') {
			System.out.println("여자입니다.");
		}else {
			System.out.println("남자입니다.");
		}
		String str = gender == 'F' ? "여자입니다." : "남자입니다.";
		System.out.println(str);
		
		/* if(조건식){
		 * 		실행명령문1
		 * 		실행명령문2
		 * 		실행명령문3
		 * 		...
		 * }else{
		 * 		실행명령문a
		 * 		실행명령문b
		 * 		실행명령문c
		 * 		...
		 * } 
		 */
	}

}
