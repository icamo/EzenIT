
public class Ex01 { // 사용자 자료형
	// 변수는 하나의 데이터만 저장을 하는 문제 때문에 같은 종류의 데이터
	// 여러개를 저장할 수 있는 배열을 만들었고 
	// 배열이 한 종류의 데이터를 여러개 저장할 수 있다면 
	// 한 종류의 데이터가 아닌 다른 종류의 데이터를 여러개 저장할 수 있는 
	// 자료형을 만들었으면 좋은데 이것을 클래스라고 한다.
	int num;
	long lnum;
	float fnum;
	double dnum;
	boolean bnum;
    // 변수에 값을 전달하기 위해서 메서드를 만듬
	public void setNum(int num) {
		this.num =  num;
	}
	public void setLnum(long lnum) {
		this.lnum = lnum;
	}
	public void setFnum(float fnum) {
		this.fnum = fnum;
	}
	public void setDnum(double dnum) {
		this.dnum = dnum;
	}
	public void setBnum(boolean bnum) {
		this.bnum = bnum;
	}
}
