package package11;

public class Ex11 {
	int period;
	int minus;
	
	public Ex11(int period) {
		this.period = period;
	}
	
	public boolean roll() {
		minus ++;
		if( minus < period ) {
			System.out.println(" 계약 기간 중입니다.");
			return true;
		}else{
			System.out.println(" 계약기간이 만료되었습니다.");
			return false;
		}
	}
	
	
	
}
