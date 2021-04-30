
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 90이상 'A', 80이상 'B', 70이상 'c', 60이상 'd' , 'F'
		int score = 78;
		if (score >= 90) {
			System.out.println("90 점 이상입니다.");
		}else {
			System.out.println("90 점보다 작습니다.");
		}
		
		if (score >= 90) {
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else if(score >= 70){
			System.out.println("C");
		}else if(score >= 60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
