package package8;

public class Ex16 {
	int [] i = {1,2,3,4,5};
	int sum = 0 ;
	public void add() {
		/*
		for(int j = 0; j <= i.length ;j++) {
			sum = sum + i[j];
		}
		*/
		for( int j : i) { // 1,2,3,4,5
			sum += j;     // j = 1, j = 2, j =3, j=4, j=5
		}
		System.out.println(sum);
	}
	public void sum(int [] z) { // int [] z = {1,2,3,4,5}
		sum = 0;
		for(int j : z) {
			sum += j; 
		}
		System.out.println(sum);
	}
}