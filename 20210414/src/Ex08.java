
public class Ex08 {

	public static void main(String[] args) {
		int [][] i = new int[3][];
		i[0] = new int[5];
		i[1] = new int[5];
		i[2] = new int[5];
		
		int [][] i1 = new int[3][];
		i1[0] = new int[3]; // 00,01,02
		i1[1] = new int[4]; // 10,11,12,13
		i1[2] = new int[5]; // 20,21,22,23,24
		i1[0][0] = 1;
		i1[0][1] = 2;
		i1[0][2] = 3;
		//i1[0][3] = 4;
		i1[1][0] = 11;
		i1[1][1] = 22;
		i1[1][2] = 33;
		i1[1][3] = 44;
		//i1[1][4] = 55;
		i1[2][0] = 211;
		i1[2][1] = 222;
		i1[2][2] = 233;
		i1[2][3] = 244;
		i1[2][4] = 255;
		
		int [][] i2 = new int[3][4];
		// 00,01,02,03
		// 10,11,12,13
		// 20,21,22,23
		i2[0][0] = 1;
		i2[0][1] = 2;
		i2[0][2] = 3;
		i2[0][3] = 4;
		i2[1][0] = 11;
		i2[1][1] = 22;
		i2[1][2] = 33;
		i2[1][3] = 44;
		i2[2][0] = 111;
		i2[2][1] = 122;
		i2[2][2] = 133;
		i2[2][3] = 144;
		
		for(int j = 0; j <= 2 ; j ++) {
			for(int z = 0; z<= 3; z++) {
				i2[j][z] = j + z;
			}
		}
		System.out.println(i2.length); // 3
		System.out.println(i2[0].length); // 1차원배열의 크기
		for(int j = 0; j< i2.length; j++) {
			for(int z = 0; z < i2[j].length ; z++) {
				System.out.println(i2[j][z]);
			}
		}
	}

}
