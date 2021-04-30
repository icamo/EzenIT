
public class Ex02Test {
	public static void main(String [] args) {
		Ex02 ex = new Ex02(); // default 생성자를 통해서 객체 생성
		ex.setAddr("성남");
		ex.setAge(10);
		ex.setName("이숭무");
		System.out.println(ex.getAddr());
		System.out.println(ex.getAge());
		System.out.println(ex.getName());
		
		Ex02 ex1 = new Ex02(15, "이숭무", "성남");
		// 생성자는 객체가 생성되었을 때 멤버필드에 값을 초기화하지만
		// 생성 후 값을 값을 변경할 수 는 없다.
		System.out.println(ex1.getAddr());
		System.out.println(ex1.getAge());
		System.out.println(ex1.getName());
	
		// 입력된 값에서 다른 값으로 변경해야 하는 경우 setter
		ex1.setAddr("서울");
		System.out.println(ex1.getAddr());
		System.out.println(ex1.getAge());
		System.out.println(ex1.getName());			
	}
}
