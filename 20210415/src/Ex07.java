
public class Ex07 {

	public static void main(String[] args) {
		int [] i1 = {1,2,3,4};
		for(int idx = 0; idx < i1.length; idx++) {
			System.out.println(i1[idx]);
		}
		System.out.println("================================");
		for (int num : i1) { // 1,2,3,4
			System.out.println(num);
		}
		int [][] i2 = {{1,2,3},{1,2,3,4},{1,2,3,4,5}};
		for(int row = 0; row < i2.length; row++ ) {
			for(int col = 0; col <i2[row].length ; col++) {
				System.out.println(i2[row][col]);
			}
		}
		//  {{1,2,3},{1,2,3,4},{1,2,3,4,5}}¿¡¼­ 
		for(int [] row : i2) { // {1,2,3} // {1,2,3,4} // {1,2,3,4,5}
			for(int num : row) { // 1, 2, 3 // 1,2,3,4 // 1,2,3,4,5
				System.out.println(num);
			}
		}
	}

}
