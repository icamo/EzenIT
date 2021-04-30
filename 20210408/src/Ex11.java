
public class Ex11 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		i = 20;
		System.out.println(i);
		int j, k ,l;
		j = k = l = 20;
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		i = i + 1;
		System.out.println(i);
		i++;
		System.out.println(i);
		i+=1; // i = i + 1;
		System.out.println(i);
		i+=2;// i = i + 2;
		System.out.println(i);
		i-=2;// i = i - 2;
		System.out.println(i);
		i*=2;// i = i * 2;
		System.out.println(i);
		i %= 2;//i = i % 2;
		System.out.println(i);
		// +=, -=, *=, /=, %=
		int score = 85;
		/// 삼항 연산자. 
		/// "합격", "불합격"
		String grade = score >= 60 ? "합격" : "불합격";
		System.out.println(grade);
		// 'A'>=90 , 'B'>=70 , 'C'< 70미만
		grade = score >= 90? "A" : (score >= 70 ? "B" : "c");
		System.out.println(grade);
	}

}
