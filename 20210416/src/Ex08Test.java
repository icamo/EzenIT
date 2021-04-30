
public class Ex08Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex08 ex = new Ex08("이숭무", 25, 175.5);
		System.out.println(ex.getName());
		System.out.println(ex.getAge());

		// 생성자를 통해서 일부 멤버필드 값만 초기화 시키고 나중에 나머지에 값을 저장
		Ex08 ex1 = new Ex08("이상범", 17);
		ex1.setHeight(178.5);
		System.out.println(ex1.getAge());
		System.out.println(ex1.getHeight());
		System.out.println(ex1.name);
	}

}
