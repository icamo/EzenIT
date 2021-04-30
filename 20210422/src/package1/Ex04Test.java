package package1;

public class Ex04Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04 ex = new Ex04(3, 3.141592);
		double result =  ex.areacircle();  // 재정의된 메서드 사용
		System.out.println(result);
		result = ex.area(); // 부모클래스의 메서드 사용
		System.out.println(result);
		
		
	}

}
