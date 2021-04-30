
public class Ex5 {
    /// if ~ else문
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택을 할 때 두개 중 택1
		int money = 3000;
		if(money >= 3000 ) { //  if문안의 결과는 부울 타입이와야 한다.
			    //  조건식은 비교연산자, 논리연산자가 와야 한다. 
			System.out.println("차를 타고 가시오.");
		}else{ /// 거짓일 때 실행
			System.out.println("걸어 가시오.");
		}
		char gender = 'F';
		if(gender == 'M') {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
		
		//60점 이상이면 합격, 미만이면 불합격
		int score = 57;
		if(score >= 60) {
			System.out.println("합격입니다.");
		}else {// 조건식이 거짓일 때 실행
			System.out.println("불합격입니다.");
		}
	}

}
