
public class Ex9 {
	public static void main(String[] args) {
		// 2중 while
		// 2단 
		int dan = 2;
		int gop = 1;
		while(gop <= 9) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
			gop++;
		}
		// 3단
		dan = 3;
		gop = 1;
		while(gop <= 9) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
			gop++;
		}
		// 4단
		dan = 4;
		gop = 1;
		while(gop <= 9) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
			gop++;
		}
		System.out.println("======================================");
		dan = 2;
		while(dan <= 4) {
			gop = 1;
			while(gop <= 9) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
				gop++;
			}
			dan ++;
		}
	}
}
