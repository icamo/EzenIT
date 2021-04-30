
public class Ex09 {

	public static void main(String[] args) {
		int [] i = {10,20,30,40,50,60,70,80,90,100};
		// 쉬운 for문으로 합을 구하시오.
		int sum = 0;
		for(int num : i) {
			sum += num;
		}
		System.out.println(sum);
		
		sum = 0;
		// 배열인 경우에만 크기가 있다.
		int [] score = {60,89,56,73,66,90,95};
		// 평균을 구하시오.
		for(int num : score) {
			sum += num;
		}
		System.out.println( sum / score.length );		
	}
}
