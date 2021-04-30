public class Ex19 {
	// 상수는 변하는 않는 값
	int i = 10;
	final int i1 = 10; // 상수
	public void setValue(int i) {
		this.i = i;
		//this.i1 = i1; final키워드를 가지고 있으면 값을 변경하지 못한다.
	}
	public void print() {
		System.out.println(i);
		System.out.println(i1);
	}
}