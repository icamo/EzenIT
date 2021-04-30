
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1[] ; // i1 : null
		//System.out.println(i1); // nullpoint
		int i2[] ;
		i2 = new int[5]; // 0,0,0,0,0
		// 각 요소에 값 확인 
		for(int j = 0 ; j < i2.length; j++) {
			System.out.println(i2[j]);
		}
		long l1[];
		l1 = new long[5]; // 0,0,0,0,0
		for(int j = 0; j < l1.length; j++) {
			System.out.println(l1[j]);
		}
		float f1[];
		f1 = new float[5];// 0.0,0.0,0.0,0.0,0.0
		for(int j = 0 ; j < f1.length; j++) {
			System.out.println(f1[j]);
		}
		double d1[];
		d1 = new double[5]; // 0.0,0.0,0.0,0.0,0.0
		for(int j = 0; j < d1.length; j++) {
			System.out.println(d1[j]);
		}
		boolean b1[];
		b1 = new boolean[5];// false,false,false,false,false
		for(int j = 0; j < b1.length; j++) {
			System.out.println(b1[j]);
		}
		int i;
		// System.out.println(i); //not have been initialized
	}

}
