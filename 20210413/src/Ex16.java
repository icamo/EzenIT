
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i4 = 40;
		int sum = 0;
		sum = sum + i1;
		sum = sum + i2;
		sum = sum + i3;
		sum = sum + i4;
		
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;

		sum = 0;
		int [] i = {10,20,30,40};
		sum = sum + i[0];
		sum = sum + i[1];
		sum = sum + i[2];
		sum = sum + i[3];
		
		sum = 0;
		for(int j = 0; j <= 3; j++) {
			sum = sum + i[j];
		}
		System.out.println(sum);
		
		
		
	}

}
