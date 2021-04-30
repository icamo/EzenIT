package package3;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Bird bird = new Bird();
		cat.breathe();
		cat.sound();
		
		bird.breathe();
		bird.sound();
		
		//변수의 자동 타입 변환
		Animal animal = null ; // new Animal(); // 부모  클래스
		animal = new Cat();
		animal.breathe();
		animal.sound();
		
		animal = new Bird();
		animal.breathe();
		animal.sound();
		
		animalSound(new Cat()); // 야용
		animalSound(new Bird()); // 짹짹
		
		print(1);
		print(100);
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	public static void print(int i) {
		System.out.println(i);
	}

}
