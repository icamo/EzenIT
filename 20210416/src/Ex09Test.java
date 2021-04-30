
public class Ex09Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex09 ex = new Ex09("현대차", "소나타", 300);
		System.out.println(ex.getCompany());
		System.out.println(ex.getModel());
		System.out.println(ex.getMaxSpeed());
		
		Ex09 ex1 = new Ex09("기아차","K5", "검정");
		System.out.println(ex1.getCompany());
		System.out.println(ex1.getModel());
		System.out.println(ex1.getColor());
	}

}
