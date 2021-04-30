package package8;

public class Ex19Test {

	public static void main(String[] args) {
		int [] i = new int[] {1,2,3,4,5};
		int [] j = {1,2,3,4,5};
		int [] k = new int[5];
		k[0] = 1;
		k[1] = 2;
		k[3] = 3;
		
		int sum = 0;
		for(int x = 0; x < j.length ; x++ ) {
			sum += j[x];
		}
		System.out.println(sum);
		
		sum = 0;
		for(int x : j) {
			sum += x;
		}
		System.out.println(sum);
	}
}
