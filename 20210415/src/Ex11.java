
public class Ex11 {
	
	public static void main(String[] args) {
		// 열거형 자료형에서 사용할수 있는 메서드
		// name() :  문자열 값으로 받아오는 메서드
		// ordinal() : 열거 상수의 숫자를 가져옴 
		// compareTo() : 비교하는 값이 앞뒤로 얼마나 멀리 있는 지
		// valueOf() : 해당 문자열이 열거형에 있는 확인하여 상수를 가져옴
		// values() : 열거 상수를 모두 가져옴
		
		Week today = Week.SUNDAY;
		System.out.println(today);
		String name = today.name(); // 열거형이 문자열 값으로
		System.out.println(name);
		
		/// 열거형을 열거 상수의 숫자를 가져오자 
		int ordinal = today.ordinal();
		System.out.println(ordinal); // 6
		
		// compareTo
		Week day1 = Week.TUESDAY;
		Week day2 = Week.THURSDAY;
		//            1              3 : 1 - 3 = -2
		int result = day1.compareTo(day2); // -2
		System.out.println(result); // -2
		     //    3             1 : 3 - 1 : 2 
		result = day2.compareTo(day1);
		System.out.println(result); // 2
		
		String day = "THURSDAY";
		Week weekDay = Week.valueOf(day);
		System.out.println(weekDay);
		/* 오류 발생
		day = "THURS";
		weekDay = Week.valueOf(day);
		System.out.println(weekDay);
		*/
		
		// values
		Week day3 = Week.FRIDAY;
		Week [] days = Week.values();
		for(Week wk : days) {
			System.out.println(wk);
		}		
	}
}
