
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1[] = {1,2,3,4,5};
		int i2[] = {11,22,33,44,55};
		int i3[] = {12, 13, 14, 15, 16};
		// 엑셀 처럼 표형태로 되어 있는 것을 2차원 배열
		// 다차원배열이란 1차원배열이 모이면 2차원배열이되는 것을 말한다.
		int i[][] = new int[3][];
		i[0] = i1;
		i[1] = i2;
		i[2] = i3;
		System.out.println(i1[0]);
		System.out.println(i[0][0]);
		System.out.println(i2[0]);
		System.out.println(i[1][0]);
		// 15
		System.out.println(i[2][3]);
		
		System.out.println(i1.length);
		System.out.println(i[0].length);
		System.out.println(i2.length);
		System.out.println(i[1].length);
		System.out.println(i.length); // 2차원 배열의 크기는 1차원배열의 갯수
	}

}
