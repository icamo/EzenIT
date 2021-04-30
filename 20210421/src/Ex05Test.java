
public class Ex05Test {
	public static void main(String[] args) {
		Ex05 ex = new Ex05("현대차", "소나타");
		ex.setMaxspeed(250);
		ex.print();
		System.out.println(ex.getMaxSpeed());
	}
}