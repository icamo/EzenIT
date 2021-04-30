
public class Ex04Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04 ex = new Ex04();
		ex.setAge(15);
		///System.out.println(ex.age);
		//ex.age = 20; // 은닉되어 있지 않다.
		             // 보호받지 못하고 있다.
		System.out.println(ex.getAge());
		//ex.age = 39;
		// System.out.println(ex.age);
	}

}
