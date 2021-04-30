package package9;

public class Ex21 implements Ex20{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");		
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume > Ex20.MAX_VOLUME) {
			this.volume = Ex20.MAX_VOLUME;
		}else if(volume < Ex20.MIN_VOLUME) {
			this.volume = Ex20.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + volume);
	}
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		}else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}
}
