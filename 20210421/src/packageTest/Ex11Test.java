package packageTest;
public class Ex11Test { 
	public static void main(String[] args) {
		Ex11 ex = new Ex11();
		// ex.num = 1; private접근할 수 없다.
		ex.pi = 3.14192; // protected이기 때문에 같은 패키지 내에서는 
		//                  접근할 수 있다.
		ex.name = "이숭무"; // public이므로 접근 가능
 	}
}
