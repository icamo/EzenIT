
public class Ex04Test {

	public static void main(String[] args) {
		// 객체 생성 후에 멤버 필드에 값을 저장 
		Ex04 ex = new Ex04(); // 객체생성
		ex.setName("이숭무"); 
		ex.setHeight(175.5);
		ex.setAge(15);
		Ex04 ex1; // 객체변수 선언
		ex1 =  new Ex04(); // 객체 생성
		// 객체가 만들어 질 때 멤버필드에 값을 저장하고 싶다.
		Ex04 ex2 = new Ex04("박준현",21,176.5);
		System.out.println(ex2.getAge());
		System.out.println(ex2.getHeight());
		System.out.println(ex2.getName());
		
		
		
		
		
		
		
		
		
		
	}

}
