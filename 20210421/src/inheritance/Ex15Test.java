package inheritance;

public class Ex15Test {
  // 멤버 필드는 기본 접근 지정자가 protected
  // 생성자의 기본 접근지정자는 default가 할당된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex16 ex = new Ex16();
		//ex.num1 = 10;
		//ex.num2 = 20;
		ex.setNum1(10);
		ex.setNum2(20);
		System.out.println(ex.num1);
		System.out.println(ex.num2);
		int i = ex.sub(); // Ex15있는 것을  Ex16을 이용해서 가져옴
		System.out.println(i);
		i = ex.div(); // Ex16
		System.out.println(i);
	}

}
