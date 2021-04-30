
public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 65;
		int z = 70;
		/// 비교연산의 결과 논리형 
		boolean b  = i > j ; // false
		boolean b1 = j == z; // false
		boolean b2 = b && b1; // false and false 
		System.out.println(b2);
		b2 = i > j && j == z;
		System.out.println(b2);
		System.out.println(i > j && j == z);
		
		b = i < j; // true
		b1 = j < z; // true
		b2 = b && b1;
		System.out.println(b2);
		b2 = i < j && j < z;
		System.out.println(b2);
		System.out.println(i < j && j < z);
		
		i = 65;
		j = 55;
		z = 90;
		/// or (||)
		b = i == j; // false
		b1=	j > z; // false
		b2 = b || b1;
		System.out.println(b2);
		b2 = i == j || j > z;
		System.out.println(b2);
		System.out.println(i == j || j > z);
		
		b = i > j; // true
		b1 = j > z; // false
		b2 = b || b1; // true or false = true
		System.out.println(b2);
		
		b2 = i > j || j > z; // true or false = true
		System.out.println(b2);
		
		System.out.println(i > j || j > z);
	}

}
