
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 90점 이상이면 A이지만 95점이면 A+  아니면 A
		// 80점 이상이면 B이지만 85점이면 B+  아니면 B
		int score = 97;
		if(score >= 90) {
			if(score>=95) {
				System.out.println("A+");
			}else {
				System.out.println("A");
			}
		}else if(score >=80) {
			if(score>=85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
		}

	}
}