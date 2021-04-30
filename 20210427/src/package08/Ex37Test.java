package package08;

public class Ex37Test {

	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.toString());
		}catch(NullPointerException e) {
			name= "ÀÌ¼þ¹«";
			System.out.println(name.toString());
		}
	}

}
