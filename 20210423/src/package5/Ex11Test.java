package package5;

public class Ex11Test {

	public static void main(String[] args) {
		// 익명 객체 생성 : interface로만 생성가능
		// 일반 클래스나 추상클래스를 이용해서 익명 객체를 만들 수 없다.
		// 익명 객체를 만들면 클래스에 상속하지 않아도 된다.
		// interface를 클래스에 상속하지 않고 객체를 만들자.
		// 객체 생성할 때 생성자 뒤에 {}를 하면 익명 객체를 만들 수 있다.
		Ex11 ex = new Ex11() { // TV리모콘
			private int volume; //필드를 추가
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");			
			}
			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");		
			}
			@Override
			public void setVolume(int volume) {
				if(volume > Ex11.MAX_VOLUME) {
					this.volume = Ex11.MAX_VOLUME;
				}else if(volume < Ex11.MIN_VOLUME) {
					this.volume = Ex11.MIN_VOLUME;
				}else {
					this.volume = volume;
				}
				System.out.println("현재 소리 크기는 : " + this.volume);
			}
		};
		ex.setVolume(11);
		ex.setVolume(-200);
		ex.setVolume(5);
	}

}
