
public class Ex5 {
    // i++ : i = i + 1
	// i-- : i = i - 1
	public static void main(String[] args) {
		int i = 10;
		--i ; // i = i - 1
		System.out.println(i); //9
		--i;
		System.out.println(i); //8
		i--;
		System.out.println(i); //7
		System.out.println(--i);
		/* i = i - 1 // 6
		 * System.out.println(i)  // 6
		 */
		System.out.println(i--);
		/*
		 * System.out.println(i)  // 6
		 * i = i - 1;   // 5
		 */
		System.out.println(i);
		System.out.println("=======================");
		i = 10;
		int j = 10;
		//       11 + 
		int z = ++i + j++;
		// i = i + 1 : i = 10 + 1 // 11
		// z = 11 + j; // 21
		// j = j + 1; //11
		System.out.println("z = " + z);
		System.out.println("i = " + i);
		System.out.println("j = " + j);							
	}
}