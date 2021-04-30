
public class Ex01Test {

	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		ex.setNum(1); // 호출 메서드
		System.out.println(ex.getNum());
		// 객체 생성을 할 때 무조건 생성자를 실행해서 객체 생성을 한다.
		// '()'가 있으면 메서드라고 부른다.
		
		Ex01 ex1 = new Ex01(1,"WRITER");
		// 생성자가 하는 역할은 객체생성시에 멤버필드에 값을 초기화 한다.

	}

}
