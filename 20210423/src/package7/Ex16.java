package package7;

// TV RemoteControl
// 두개 이상의 interface를 상속하는 것을 다중 상속
// interface만 다중 상속이 가능하다.
// class는 다중 상속을 할 수 없다.
public class Ex16 implements Ex14, Ex15 {
	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");	
	}
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
		if(volume > Ex14.MAX_VOLUME) {
			this.volume = Ex14.MAX_VOLUME;
		}else if(volume < Ex14.MIN_VOLUME) {
			this.volume = Ex14.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + volume);
	}
}
