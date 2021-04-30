package package11;

public class Ex12 extends Ex11{
	public Ex12(int year) {
		super(year);
	}
	
	public boolean roll() {
		minus ++;
		if( minus < period ) {
			System.out.println(" 커피빈과  계약 기간 중입니다.");
			return true;
		}else{
			System.out.println(" 커피빈과  계약기간이 만료되었습니다.");
			return false;
		}
	}
}
