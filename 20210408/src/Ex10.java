
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 60;
		int j = 70;
		boolean b = i > 50; // true
		boolean b1 = j < 60; // false
		boolean b2 = b && b1; // true and false = false
		System.out.println(b2);		
		System.out.println(i > 50 && j < 60);
		
		b2 = b || b1; // true || false = true
		System.out.println(b2);
		System.out.println(i > 50 || j < 60);	
		
		b =  i < 50; // false
		b1 =  j > 90; // false
		b2 = b || b1 ;//false
		System.out.println(b2);
		System.out.println(!b2);
	}
}

// 부호연산자 : +, -
// 단항연산자 : ++, --
// 이항연산자 : 산술연산자 : +,-,*,/, %
//           관계연산자 : < , > ,==, <=,>=
//           논리연산자 : &&, ||, !

