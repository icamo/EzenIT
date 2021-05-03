package package02;

public class Ex07Test {

	public static void main(String[] args) {
		
		// 박싱(Boxing)
		String str = "100";
		Integer i1 = Integer.parseInt(str);
		Integer i2 = new Integer(str);
		Integer i3 = Integer.valueOf(str);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		// 언박싱(UnBoxing)
		int ii1 = i1;
		int ii2 = i1.intValue();
		System.out.println(ii1);
		System.out.println(ii2);
		
		String str1 = "true";
		Boolean b = Boolean.parseBoolean(str1);
		if(b) {
			System.out.println("부울 타입으로 변환");
		}
		
	}

}
