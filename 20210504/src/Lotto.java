import java.util.*;

public class Lotto {

	public static void main(String[] args) {

		List<Integer> lotto = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 게임 수를 입력하시오.");
		int cnt = sc.nextInt();
		for (int j = 0; j < cnt; j++) {

			for (int i = 1; i <= 45; i++) {
				lotto.add(i);
			}

			int[] num = new int[6];
			for (int i = 0; i < num.length; i++) {
				int idx = (int) (Math.random() * lotto.size());
				num[i] = lotto.get(idx);
				lotto.remove(idx);
			}

			for (Integer lottoNum : num) {
				System.out.print(lottoNum + " ");
			}
			System.out.println();

		}

	}

}
