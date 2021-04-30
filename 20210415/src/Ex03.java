
public class Ex03 {

	public static void main(String[] args) {
		/// 2차원배열은 1차원배열의 집합체
		int i1[] = {1,2,3};
		int i2[] = {11,12,13};
		int i3[] = {111,112,113};
		
		int i [][] = new int[3][];
		i[0] = i1;
		i[1] = i2;
		i[2] = i3;
		
		System.out.println(i1[0]); System.out.println(i1[1]);
		System.out.println(i[0][0]);System.out.println(i[0][1]);
	}

}
