package package01;

public class Ex01 {
	
	public void gugu(int startDan, int endDan, int startGop, int endGop) {
		for(int dan = startDan; dan <= endDan; dan++) {
			System.out.println(dan + "단 입니다.");
			for(int gop = startGop; gop <= endGop; gop++) {
				System.out.println(dan + " * " + gop + " = " + (dan * gop));
			}
			System.out.println();
		}		
	}
	
	
	
	
}
