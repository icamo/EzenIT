
public class Ex16 {
	// 원주율
	static double pi = 3.141592;
	// 구구단
	static void gugu(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		} 
	}
	// 합구하기
	static int sum(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end ; i++) {
			sum = sum + i;
		}
		return sum;
	}
	// 원의 면적
	static double circle(int radius) {
		return radius * radius * pi;
	}
}
