
public class Ex6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// 90점이상 'A', 80 점 이상 'B', 70이상이면 'C'
		/// 60점 이상이면 'D', 아니면 'F'
		int score = 78;
		if(score >= 90) {
			System.out.println("A");
		}else  if(score >= 80){
			System.out.println("B");
		}else if(score >= 70){
			System.out.println("C");
		}else if(score >= 60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		System.out.println("========if ~ else if========");
		int num = (int)(Math.random() * 6 ) + 1; // 1~6 
		// (Math.random() * 6 )   : 0, 1, 2, 3, 4, 5
        //		               +1 : 1  1  1  1  1  1
		//                        : 1  2  3  4  5  6
		System.out.println(num);
		/// num이 1:1입니다. 2:2입니다. ,..., 6:6입니다.
		if (num == 1) {
			System.out.println("1입니다.");
		}else if(num == 2) {
			System.out.println("2입니다.");
		}else if(num == 3) {
			System.out.println("3입니다.");
		}else if(num == 4) {
			System.out.println("4입니다.");
		}else if(num == 5) {
			System.out.println("5입니다.");
		}else if(num == 6) {
			System.out.println("6입니다.");
		}
		
		System.out.println("===== switch ======");
		
		switch(num) { 
		case 1 : // if(num == 1)
			System.out.println("1입니다.");
			break;
		case 4 : // if(num==4)
			System.out.println("4입니다.");
			break;
		case 2 : // if(num == 2)
			System.out.println("2입니다.");
			break;
		case 5 : // if(num == 5)
			System.out.println("5입니다.");
			break;
		case 3 : // if(num == 3)
			System.out.println("3입니다.");
			break;
		case 6 : // if(num==6)
			System.out.println("6입니다.");
			break;
		}
	}
}
