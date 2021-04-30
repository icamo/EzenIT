package package6;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		myCar.i = 10;
		System.out.println(myCar.i);
		
		//    Tire frontLeftTire = new KumhoTire();
		myCar.frontLeftTire = new KumhoTire(); // Tire, KumhoTire
		//    Tire backRightTire 
		myCar.backRightTire = new HankookTire();	
		myCar.i = 20;
		myCar.run();
	}

}
