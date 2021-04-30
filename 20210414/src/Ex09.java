
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] i1 = new int[3][];
		i1[0] = new int[3];
		i1[1] = new int[4];
		i1[2] = new int[5];
		int [][] i2 = new int[3][4];
		i2[0][0] = 1;
		//...
		i2[2][3] = 111;
		int [] i = {1,2,3,4};
		int [][] i3 = {{1,2,3,4},{11,12,13,41},{21,22,23,24}};
		System.out.println(i3[1][3]); // 41
		int [][] i4 = {{1,2,3},{11,12,13,14},{21,22,23,24,25}};
		           //     0         1         2
		           //   0 1 2    0  1  2  3    0  1  2  3  4
		System.out.println(i4[1][2]);
		
		int [][] i5 = new int[3][4];
		System.out.println(i5.length); // 3
		System.out.println(i5[0].length); // 4
		System.out.println(i5[1].length); // 4
		System.out.println(i5[2].length); // 4 // 1차원배열의 크기
		
		int [][] i6 = new int[2][]; // new int[2][4]
		i6[0] = new int[4]; // 4 // 1차원배열
		i6[1] = new int[4]; // 4
		System.out.println(i6[0].length); // 4 1차원배열의 크기 
		System.out.println(i6[1].length); // 4
		
	}
}
