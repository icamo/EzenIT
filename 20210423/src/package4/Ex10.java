package package4;
// TV RemoteControl
public class Ex10 implements Ex08{
	private int volume;
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
		if(volume > Ex08.MAX_VOLUME) { // 입력된 값이 MAX_VOLUME보다 크다면 
			this.volume = Ex08.MAX_VOLUME; // MAX_VOLUME으로 volume을 
		}else if(volume < Ex08.MIN_VOLUME) {// 입력된 값이 MIN_VOLUME보다 작다면
			this.volume = Ex08.MIN_VOLUME; // MIN_VOLUME으로 volume을		
		}else {  // 0~ 10사이에 있는 값
			this.volume = volume;
		}
	}
}
