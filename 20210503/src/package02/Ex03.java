package package02;

public class Ex03 {

	public static void main(String[] args) {
		
		//Wrapper �ڷ��� : �⺻ �ڷ����� ���ڿ��� ��ȯ�ϰ� ���ڿ��� �⺻ �ڷ������� ��ȯ�� �����ϵ��� �ϱ� ���� �ڷ���
		int i = 10;
		Integer i1 = 10;
		short s = 10;
		Short s1 = 10;
		byte b = 12;
		Byte b1 = 12;
		long l = 10L;
		Long l1 = 10L;
		float f = 3.14F;
		Float f1 = 3.14F;
		double d = 3.14;
		Double d1 = 3.14;
		boolean bl = false;
		Boolean bl1 = false;
		
		Integer i2 = 100;	// �ڽ�		Wrapper�ڷ��� = �⺻�ڷ���;
		int i3 = i2; 		// ��ڽ�		�⺻�ڷ��� = Wrapper�ڷ���;
		
		//Wrapper�ڷ����� null���� �����ϱ� ���� ����Ѵ�.
		//���ڿ��� �⺻ �ڷ������� ��ȯ�ϱ� ���� ����Ѵ�.
		i2 = null;
		
		
	}

}
