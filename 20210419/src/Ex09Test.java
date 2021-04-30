
public class Ex09Test {

	public static void main(String[] args) {
		Ex09 ex = new Ex09();
		ex.setAge(16);
		ex.setHeight(178.5);
		ex.setName("도동규");
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println(ex.getName());
		
		Ex09 ex1 = new Ex09("이숭무", 25);
		ex1.setHeight(175.5);
		System.out.println(ex1.getAge());
		System.out.println(ex1.getHeight());
		System.out.println(ex1.getName());
		
	}

}
