
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4단 부터 6단 출력
		for(int dan = 4; dan <= 6; dan++) {
			//  1             2       4
			// 3
			for(int gop = 1; gop <= 9; gop ++) {
				// 3- 1        3-2      3-4 
				// 3- 3
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
	}
	
// 1-> 2 -> 3-1 -> 3-2 -> 3-3 -> 3-4 -> 3-2 ->...-> 3-4-> 3-2 -> 4 -> 2 -> 3-1
	
	

}
