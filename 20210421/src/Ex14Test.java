
public class Ex14Test {

	public static void main(String[] args) {
		Ex14 ex = new Ex14(); // 객체 생성하려면 생성자 먼저 실행
		ex.setAddr("서울");
		ex.setAge(15);
		ex.setName("이숭무");
		System.out.println(ex.getAddr());
		System.out.println(ex.getAge());
		System.out.println(ex.getName());
		Ex14 ex1 = new Ex14("이상범", "서울", 15); 
		System.out.println(ex1.getAddr());
		System.out.println(ex1.getAge());
		System.out.println(ex1.getName());
		
		ex1.setAddr("성남");
		System.out.println(ex1.getAddr());
	}
}
