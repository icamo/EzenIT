
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,2,3);
		sum(1,2,3,4,5);
	}
	public static void sum(int ... val) {
		int sum = 0;
		for(int s : val) {
			sum += s;
		}
		System.out.println(sum);
	}

}
