
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1= 127;
		byte b2 = 2;
		byte b3 = (byte)(b1 + b2); // 오버플로우
		int i1 = b1 + b2;
		System.out.println(b3);
		System.out.println(i1);
		int i2 = 2000000000;
		int i3 = 2000000000;
		int i4 = i2 + i3;   // 오버플로우
		System.out.println(i4);
		long l1 = (long)i2 + (long)i3;
		System.out.println(l1);
	}
}
