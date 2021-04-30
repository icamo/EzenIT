
public class Ex10 {

	public static void main(String[] args) {
		int [] i1 = new int[3]; // 주로 많이 사용하는 방법
		i1[0]=1; i1[1]=2; i1[2]=3;
		int [] i2 = {1,2,3,4};
		          // 0 1 2 3
		System.out.println(i2[1]); //2
		int [] i3 =  new int[] {1,2,3,4};
		int [] i4;
		i4 = new int[3];
		i4[0]=1; i4[1]=2; i4[2]=3;
		int [] i5;
		i5 = new int[] {1,2,3,4};
		/// 1차원 배열의 크기
		System.out.println(i1.length); //  변수명.length
		for(int j = 0; j < i1.length; j++ ) {
			System.out.println(i1[j]);
		}
	}

}
