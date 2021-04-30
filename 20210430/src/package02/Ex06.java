package package02;

public class Ex06 {
	private String company;
	private String os;
	public Ex06(String company, String os) {
		this.company = company;
		this.os = os;
	}
	public String getOs() {
		return this.os;
	}
	@Override
	public String toString() {
		return company + "," + os;
	}
	@Override
	public boolean equals(Object obj) {
		// obj와 현 클래스와 같은 지를 확인 할 때 사용.
		if(obj instanceof Ex06) {
			return true;
		}else {
			return false;
		}
	}
}
