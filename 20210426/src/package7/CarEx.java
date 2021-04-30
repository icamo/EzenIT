package package7;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		myCar.carNum = 10;
		myCar.backLeftTire = new KumhoTire();
		myCar.frontLeftTire = new KumhoTire();
		myCar.run();
	}

}
