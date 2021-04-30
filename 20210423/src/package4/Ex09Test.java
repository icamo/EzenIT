package package4;

public class Ex09Test {

	public static void main(String[] args) {
		Ex09 ex = new Ex09();
		ex.setVolume(5);
		
		Ex10 ex2 = new Ex10();
		ex2.setVolume(11); // 11 ==> 10
		ex2.setVolume(-20); // -20 ==> 0
		ex2.setVolume(5); // 0~10 
		
		/// interface 변수는 Ex09의 부모이므로 Ex09로 만든 객체를 참조 할 수 있다.
		/// interface를  상속받은 객체를 참조하는 변수를 만들 수는 있다.
		Ex08 ex1 = new Ex09(); // audio 리모콘
		ex1.setVolume(11);
		ex1.setVolume(-20);
		ex1.setVolume(5);
		
		ex1 = new Ex10(); /// tv 리모콘
		ex1.setVolume(11);
		ex1.setVolume(-20);
		ex1.setVolume(5);
		/// 다형성
		
		
		/// interface는 추상메서드를 가지고 있어 완성되어 있지 않으므로 객체 생성을 할 수 없다.
		//Ex08 ex2 = new Ex08();
		
		
	}
}
