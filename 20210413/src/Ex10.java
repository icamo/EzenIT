
public class Ex10 {

	public static void main(String[] args) {
		// 2´Ü 4´Ü
		int dan = 2; //1
		while (dan <= 4) { // 2
			/// 3
			int gop = 1; /// 3-1
			while(gop <= 9) { // 3-2
				System.out.println(dan + "*" + gop + "=" + dan*gop);//3-3
				gop++;// 3-4
			}/// 3
			dan++; // 4
		}
	}
	// 1 -> 2 -> 3-1->3-2->3-3->3-4->3-2->...->3-4->3-2->4->...->4->2
}
