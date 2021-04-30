
public class Ex07Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 자료형과 변수의 이름을 구별하기 위해서 
		// 클래스 이름의 첫글자는 영문 대문자이어야 하고
		// 변수명의 첫글자는 소문자이어야 한다.
		ex07 ex = new ex07(); 
		ex07 ex07 = new ex07(); // (x)
		ex07.setName("이숭무");
		System.out.println(ex07.getName());
	}

}
