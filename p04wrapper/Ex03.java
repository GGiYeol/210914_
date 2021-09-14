package p11api.p03lecture.p03object.p04wrapper;

public class Ex03 {

	public static void main(String[] args) {
		//unboxing
		//참조타입은 타입Value라는 것으로 언박싱한다.
		Integer i1 = new Integer(300);
		int i2 = i1.intValue();
		
		Short s1 = new Short( (short) 100); //literal한 숫자는 int 타입으로 인식해서 강제 형변환 해야함
		short s2 = s1.shortValue();
		
		Long l1 = new Long(9987987L);
		long l2 = l1.longValue();
		
		Byte b1 = new Byte((byte)123);
		byte b2 = b1.byteValue();
		
		Float f1 = new Float(3.14F);
		float f2 = f1.floatValue();
		
		Double d1 = new Double(3.14);
		double d2 = d1.doubleValue();
		
		Boolean b11 = new Boolean(true);
		boolean b12 = b11.booleanValue();
		
		Character c1 = new Character('a');
		char c2 = c1.charValue();
		
		
	}
}
