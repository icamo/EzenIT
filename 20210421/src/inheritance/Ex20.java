package inheritance;

// 자식클래스
public class Ex20 extends Ex19{
	int studentNo;

	public Ex20(String name, String ssn, int studentNo) { // 자식 클래스 생성자
		super(name, ssn); //  부모 클래스에 있는 생성자
		this.studentNo = studentNo;
	}
	public void print() {
		System.out.println(name);
		System.out.println(ssn);
		System.out.println(studentNo);
	}
}