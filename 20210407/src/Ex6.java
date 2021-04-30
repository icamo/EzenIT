
public class Ex6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -127;
		int result1 = -i;  //-(-127) : 127
		System.out.println(result1);
		result1 = +i;   // +(-127) : -127
		System.out.println(result1);
		int a = 10;
		int b = 3;
		int result2;
		result2 = a + b;
		System.out.println(result2);
		result2 = a - b;
		System.out.println(result2);
		result2 = a * b;
		System.out.println(result2);
		result2 = a / b;
		System.out.println(result2);
		result2 = a % b;
		System.out.println(result2);
		short s = -10; // -(-10) // -s
		int s1 = -s; // 정수연산은 4byte이다.
		
		int j = 10;
		int k = 20;	
		double result3 = (double)j / k; // 0.5
		System.out.println(result3);
	}
}
