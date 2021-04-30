
public class Ex03 {
	// 객체의 성질이 될 수 있는 속성 : 멤버 필드
	private String name;
	private int energy;
	// 객체가 자신이 가진 정보를 전달하는 것을 행동 : 메서드
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getEnergy() {
		return this.energy;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
