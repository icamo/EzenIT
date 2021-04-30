package package11;

public class Person {
	Ex11 contract = new Ex11(3); 
	
	int run() {
		System.out.println("계약이 성사되었습니다.");
		if(contract.roll() == false) {
			System.out.println("계약이 만료되었습니다.");
			return 1; 
		}
		return 0;
	}
}
