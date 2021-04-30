
public class Ex02Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 ex = new Ex02();
		ex.setName("이숭무");
		ex.setAge(25);
		ex.setHeight(175.5);
		System.out.println(ex.name);
		System.out.println(ex.height);
		System.out.println(ex.age);
		
		Ex02 ex1 = new Ex02();
		ex1.setName("박준현");
		ex1.setAge(25);
		ex1.setHeight(165.5);
		System.out.println(ex1.name);
		System.out.println(ex1.height);
		System.out.println(ex1.age);
		
		Car car = new Car();
		car.setCompany("현대차");
		car.setModel("소나타");
		car.setColor("검정색");
		Car car1 = new Car();
		car1.setCompany("기아차");
		car1.setModel("k5");
		car1.setColor("흰색");
		car1.company = "xsvxsdvsd";
		System.out.println(car.model);
		System.out.println(car1.model);
		int i = 10;
		Car car2 = new Car();		
	}

}
