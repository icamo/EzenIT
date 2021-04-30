
public class Ex02Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 ex = new Ex02();
		// 멤버필드를 직접 사용할 수 없는 것을 은닉
		ex.setName("이숭무"); // ex.name = "이숭무";
		ex.setAge(25); // ex.age = 25;
		ex.setHeight(175.5); // ex.height = 175.5
		ex.setAddr("서울");
		System.out.println(ex.getName());
		// System.out.println(ex.name);
		System.out.println(ex.getHeight());
		System.out.println(ex.getAge());
		System.out.println(ex.getAddr());
		Ex02 ex1 = new Ex02();
		int i [] = new int[3]; // 0
		ex1.print(); // 멤버 필드에 값을 저장하지 않았을 때의 초기값
		
	}
}







