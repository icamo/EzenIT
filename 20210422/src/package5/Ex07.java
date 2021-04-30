package package5;

//  class에 final이 있으면 상속할 수 없는 class라는 것을 의미한다.
// 상속 받을 수는 있다.
public final class Ex07 extends Ex05 {
	Ex07(int num1 , int num2){
		super(num1, num2);
	}
	public int mul() {
		return num1 * num2;
	}
}
