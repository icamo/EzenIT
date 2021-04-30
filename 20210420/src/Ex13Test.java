
public class Ex13Test {
// static에 만들어지는 변수는 모든 객체가 공유해서 사용할 수 있는 데이터이다.
// 인스턴스 변수는 객체내에서만 사용가능한 변수이므로 공유할 수 없다.
	public static void main(String[] args) {
		Ex13 ex = new Ex13(); // c= 0 + 1 , count = 0 + 1 : 1
		System.out.println("ex.c : " + ex.c);
		System.out.println("ex.count : " + ex.count);
		Ex13 ex1 = new Ex13(); // c = 0 + 1 : 1,count = 1 + 1 :2
		System.out.println("ex1.c : " + ex1.c);
		System.out.println("ex1.count : " + ex1.count);
		Ex13 ex2 = new Ex13(); // c = 0 + 1 :1, count = 2 + 1 : 3 
		System.out.println("ex2.c : " + ex2.c);
		System.out.println("ex2.count : " + ex2.count);	
	}

}
