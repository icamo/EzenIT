
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3단 8단 까지 반복 , 4곱에서 7곱까지
		int startDan = 5;
		int endDan = 8;
		int startGop = 3;
		int endGop = 7;
		for(int dan = startDan; dan <= endDan; dan ++) {
			for(int gop = startGop; gop <= endGop; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
	}
}
