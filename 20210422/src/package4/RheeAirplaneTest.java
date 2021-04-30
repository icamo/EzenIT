package package4;

public class RheeAirplaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RheeAirplane ex = new RheeAirplane();
		ex.fly(); 
		ex.flyMode = RheeAirplane.SUPERSONIC;
		ex.fly();
		ex.flyMode = RheeAirplane.NORMAL;
		ex.fly();	
	}

}
