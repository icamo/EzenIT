
public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem1 =  new Member();
		mem1.idx = mem1.idx + 1;        // 1
		mem1.setMemberNum(mem1.idx);   // 1
		mem1.setName("ÀÌ¼þ¹«");
		System.out.println(mem1.getMemberNum());
		
		Member mem2 = new Member();
		mem2.idx = mem2.idx + 1;   // 1 + 1 = 2 
		mem2.setMemberNum(mem2.idx); // 2
		System.out.println(mem2.getMemberNum());
		
		Member mem3 = new Member();
		mem3.idx = mem3.idx + 1; // 2 + 1
		mem3.setMemberNum(mem3.idx); // 3
		System.out.println(mem3.getMemberNum());	
	}
}
