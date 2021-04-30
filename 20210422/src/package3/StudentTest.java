package package3;

public class StudentTest {

	public static void main(String[] args) {
		
		// 자식 생성자에서 부모 생성자를 실행을 시키고 자식 생성자가 받아온 값을 
		// 부모 생성자에 전달  super()
		Student ex =  new Student("이숭무", "123456-1234567",1);
		System.out.println(ex.name);
		System.out.println(ex.ssn);
		System.out.println(ex.studentNo);
	}

}
