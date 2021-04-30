
public class Ex06 {

	public static void main(String[] args) {
		int [][] i1 = new int[3][];
		i1[0] = new int[3];
		i1[1] = new int[4];
		i1[2] = new int[5];
		// 2차원 배열의 크기 : 행의 크기
		System.out.println(i1.length); // 
		// 2차원 배열의 한 행(1차원배열)의 크기
		System.out.println(i1[0].length); // 3
		System.out.println(i1[1].length); // 4
		System.out.println(i1[2].length); // 5
		for(int row = 0; row < i1.length; row++ ) {
			for(int col = 0; col < i1[row].length; col++){
				i1[row][col] = row + col;
			}
		}
		for(int row = 0; row < i1.length; row++) {
			for(int col = 0; col < i1[row].length; col++) {
				System.out.println(
					"i1[" + row + "][" + col + "] = " + i1[row][col]);
			}
		}		
	}
}
