package package10;
// 객체지향의 3대요소 : 캡슐화 , 상속, 다향성
public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		Car car = new Car();
		boolean stop = false;
		while (!stop) { 
			int num = car.run(); // 타이어의 위치
			switch(num) {
			case 1: // 앞왼쪽
				System.out.println("앞 왼쪽 타이어를 교체");
				car.frontLeftTire = new KumhoTire( "앞왼쪽", 15);
				/// 객체 다향성
				break;
			case 2: // 앞오른쪽
				System.out.println("앞 왼쪽 타이어를 교체");
				car.frontRightTire = new KumhoTire( "앞오른족", 15);
				//    tire 부모                 // tire 자식
				break;
			case 3: // 뒤왼쪽
				System.out.println("앞 왼쪽 타이어를 교체");
				car.backLeftTire = new HankookTire ( "뒤왼쪽", 15);
				break;
			case 4: // 뒤오른쪽
				System.out.println("앞 왼쪽 타이어를 교체");
				car.backRightTire = new HankookTire( "뒤오른족", 15);
				break;
			}
			number --; // 5,4,3,2,1,0
			if(number == 0) stop = true;
		}
	}
}
