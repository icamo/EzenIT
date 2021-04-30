
public class Ex05Test {

	public static void main(String[] args) {
		Ex05 ex = new Ex05("이숭무", 15, 170.5);
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println(ex.getName());
		Ex05 ex1 = new Ex05(); // default 생성자가 실행
		ex1.setAge(20);
		ex1.setHeight(165.5);
		ex1.setName("박준현");
		System.out.println(ex1.getAge());
		System.out.println(ex1.getHeight());
		System.out.println(ex1.getName());
		
		
	}

}
