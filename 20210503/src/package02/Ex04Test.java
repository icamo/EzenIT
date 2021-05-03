package package02;

public class Ex04Test {

	public static void main(String[] args) {
		
		String s1 = "123";
		// int i = s1;
		Integer i1 = Integer.parseInt(s1);
		Integer i2 = new Integer(s1);
		System.out.println(i1);
		System.out.println(i2);
		String s2 = "10.5";
//		Integer i3 = Integer.parseInt(s2);
//		System.out.println(i3);
		int i4 = 123;
		if(i4 == i1) { // 일반자료형 == Wrapper자료형
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다.");
		}		
		
		if(i1.equals(i4)) { // Wrapper자료형.equals(일반자료형)
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다.");
		}
		
		System.out.println("MAX 값 : " + Integer.MAX_VALUE);
		System.out.println("MIN 값 : " + Integer.MIN_VALUE);
			
		
		
	}

}
