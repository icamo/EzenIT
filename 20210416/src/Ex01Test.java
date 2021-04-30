
public class Ex01Test {

	public static void main(String[] args) {
		int [] i = new int[5];
		Ex01 ex = new Ex01(); // default 생성자
		ex.name = "이숭무";
		ex.age = 25;
		ex.height = 175.5;
		ex.addr = "서울";
		
		System.out.println(ex.name);
		System.out.println(ex.age);
		System.out.println(ex.height);
		System.out.println(ex.addr);
		
		Ex01 ex1 = new Ex01();
		ex1.name = "박준현";
		ex1.age = 21;
		ex1.addr = "서울";
		ex1.height = 160.5;
		
		Ex01 ex2 = new Ex01();
		ex2.addr = "성남";
		ex2.age = 17;
		ex2.height = 173.5;
		ex2.name = "이상범";
		
			
		
		/// 변수만을 이용해서 여러 사람의 데이터를 저장하는 경우
		String name;
		name="이숭무";
		int age;
		age= 25;
		double height;
		height = 172.5;
		String addr;
		addr = "서울";
		
		String name1;
		name1= "박준현";
		int age1;
		age1 = 21;
		double height1;
		height1 = 160.5;
		String addr1;
		addr1="성남";
		
		String name2;
		name2= "박준현";
		int age2;
		age2 = 21;
		double height2;
		height2 = 160.5;
		String addr2;
		addr2="성남";
	}
}
