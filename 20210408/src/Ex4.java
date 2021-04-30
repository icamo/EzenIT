
public class Ex4 {
	public static void main(String[] args) {
		int i = 0;
		++i; // i = i + 1; // 선행 연산
		System.out.println(i);
		++i;
		System.out.println(i);
		++i; 
		System.out.println(i);
		
		int j = 1;
		System.out.println(++j); // j = j + 1
		// 선행연산 
		// j = j + 1   //2
		// System.out.println(j) // 2
		int k = 1;
		System.out.println(k++); 
		// 후행연산
		// System.out.println(j) // 1
		// k = k + 1;   //2
		System.out.println(k); 
	}
}
