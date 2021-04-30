
public class Ex8 {
	public static void main(String[] args) {
		// 논리연산자 : 논리형(boolean)을 연산 : 참과 거짓인 값을 연산 
		// and 교집합
		// 참  and 참  = 참
		// 참 and 거짓 = 거짓
		// 거짓 and 참 = 거짓
		// 거짓 and 거짓 = 거짓
		// or
		// 참 or 참 = 참
		// 참 or 거짓 = 참
		// 거짓 or 참 = 참
		// 거짓 or 거짓 = 거짓
		int i = 65;
		int j = 70;
		int z = 80;
		boolean b = i < j; // 논리형으로 결과값을 받아옴.
		boolean b1 = i > z;
		
		boolean result = b && b1; // true and false
		System.out.println(result);
		result = i < j && i > z;
		System.out.println(result);	
	}
}