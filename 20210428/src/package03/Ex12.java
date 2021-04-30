package package03;

public class Ex12 {

	String id;
	public Ex12(String id) {
		this.id = id;
	}
	public void checked(Object obj) {
		if(obj instanceof Ex12) {
			Ex12 ex =  (Ex12)obj;
			System.out.println(ex.id);
		}else {
			System.out.println(obj);
		}

	}
	/*
	public void checked(Ex12 ex12) {
		System.out.println(this.id);
	}
	public void checked(String str) {
		System.out.println(str);
	}
	public void checked(double d) {
		System.out.println(d);
	}
	public void checked(boolean b) {
		System.out.println(b);
	}
	*/
}
