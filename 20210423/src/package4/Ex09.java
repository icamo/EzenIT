package package4;

/// class에서 interface를 상속 받아온다.
/// 추상메서드를 class가 상속 받으면 구현(재정의)해야한다. implement
/// interface를 class가 상속하게 되면 interface내에 있는 추상메서드를 구현 해야한다.
/// Audio RemoteControl
public class Ex09 implements Ex08{
	private int volume; // 현재 볼륨을 저장
	@Override
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	@Override             // -1                   
	public void setVolume(int volume) {
		if (volume > Ex08.MAX_VOLUME) { // 11 = > 10
			this.volume = Ex08.MAX_VOLUME; 
		}else if(volume < Ex08.MIN_VOLUME) { // -1 => 0
			this.volume = Ex08.MIN_VOLUME;
		}else{
			this.volume = volume;
		}
		System.out.println("현재 소리 크기는 : " + this.volume);
	}

}
