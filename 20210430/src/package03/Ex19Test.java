package package03;

import java.util.StringTokenizer;

public class Ex19Test {

	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���"; 
		StringTokenizer st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
	/*
	 * charAt() : index�� �ش��ϴ� ���� ���
	 * equals() : ���ڿ��� ������ ��.
	 * indexOf() : ���ڳ� ���ڿ��� index���
	 * length() : ������ ����
	 * replace() : ���ڿ� �ٲٱ�
	 * substring() : ���ڿ� �ڸ���
	 * toLowerCase() : ��� �ҹ���
	 * toUpperCase() : ��δ빮��
	 * trim() : ���ڿ��� �յڿ� �ִ� ���鹮�� ����
	 * valueOf() : �⺻�ڷ��� ���ڿ��� ��ȯ
	 * split() : ���ڿ��� ���й��ڸ� �������� �迭�� ��ȯ
	 * 
	 * 
	 * StringTokenizer
	 * getBytes() : ���ڿ��� byte�� : ũ�� , ��ȣ
	 */
	
	
	
}