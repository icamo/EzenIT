package package12;

public class Ex14Test {

	public static void main(String[] args) {
		int [] i = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		int [] i1 = {1,2,3,4,5};
		Ex14 [] ex = new Ex14[3]; // °´Ã¼ ¹è¿­
		ex[0] = new Ex14(20, 10);
		ex[1] = new Ex14(30, 10);
		ex[2] = new Ex14(15, 10);
		System.out.println(ex[0].add());
		System.out.println(ex[1].add());
		System.out.println(ex[2].add());
	
		Ex14 ex1 = new Ex14(20, 10);
		System.out.println(ex1.add());
		
		
		
		
	}

}
