package p11api.p03lecture.p03object.p04wrapper;

public class Ex02 {

	public static void main(String[] args) {
		//boxing
		int i1 = 300;
		Integer i2 = new Integer(i1);
		
		//auto boxing -> 자주 사용하게 되어서 생김(모든 기본타입 다 가능)
		int i3 = 500;
		Integer i4 = i3;
		Integer i5 = 500;
		
		byte b1 = 100;
		Byte b2 = b1;
		Byte b3 = 100;
		
		long l1 = 12312412412L;
		Long l2 = l1;
		Long l3 = 123412341234L;
		
		short s1 = 12312;
		Short s2 = s1;
		Short s3 = 3111;
		
		float f1 = 3.14F;
		Float f2 = f1;
		Float f3 = 3.14F;
		
		double d1 = 3.14;
		Double d2 = d1;
		Double d3 = 3.14;
		
		boolean b11 = true;
		Boolean b12 = b11;
		Boolean b13 = true;
		
		char c1 = 'c';
		Character c2 = c1;
		Character c3 = 'a';
		
//		Integer i6 = 300;
//		//auto unboxing
//		System.out.println(i6 + 300);
		
	}
}
