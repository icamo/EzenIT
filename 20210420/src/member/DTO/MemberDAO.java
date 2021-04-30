package member.DTO;

public class MemberDAO {
	String name;
	int memberNum;
	String hp;
	String addr;
	/// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	/// getter
	public String getName() {
		return this.name;
	}
	public int getMemberNum() {
		return memberNum;
	}
	public String getHp() {
		return hp;
	}
	public String getAddr() {
		return this.addr;
	}
	
}
