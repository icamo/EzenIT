
public class Ex3 {
	public static void main(String[] args) {
		/// 단항연산자 : 피연산자가 1개이다.
		/// 부호연산자 (+,-)
		int i = -(-10);
		System.out.println(i);
		i = -(10); // 부호연산자.
		System.out.println(i);
		i = -10;
		System.out.println(i);
		double d = 10.5;
		System.out.println(-d); // 부호연산자.		
		// boolean 타입과 char 타입을 제외한 기본 타입에 사용 가능
		
		/// 증감연산자. (++, --)
		i = 10;
		i = i + 1; // 증가연산
		System.out.println(i); // 11
		i++;
		System.out.println(i); // 12
		i++;
		System.out.println(i); // 13
		
		i = i - 1; // 감소 연산
		System.out.println(i);
		i--;
		System.out.println(i);
		i--;
		System.out.println(i); //10
		
		++i; // i = i + 1
		System.out.println(i); //11
		--i; // i = i - 1
		System.out.println(i); // 10
		
		int z = ++i; // i = 11 z = 11
		// i = i + 1 ; z = i; // 먼저 1증가를 했으므로 선행
		System.out.println("i = " + i);
		System.out.println("z = " + z);
		
		i = 10;
		z = i++;
		// z = i; i = i + 1; // 대입을 먼저하고 나중에 1증가를 함 : 후행
		System.out.println("i = " + i); // 11
		System.out.println("z = " + z); // 10
		
		i = 10;
		System.out.println(i++); // 10
		System.out.println(i); // 11
		
		i = 78;
		/// 삼항 연산자 : 피연산자가 3개.
		String result = i >= 60 ? "합격" : "불합격";
		System.out.println(result);
	}
}
