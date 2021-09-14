package p11api.p03lecture.p03object.p04wrapper;

public class Ex06 {

	public static void main(String[] args) {
		int i1 = 1000;
		int i2 = 1000;
		
		System.out.println(i1 == i2);
		
		Integer i3 = new Integer(1000);
		Integer i4 = new Integer(1000);
		
		System.out.println(i3 == i4);// 값이 아님 참조값을 비교하기 떄문에 다르게 나온다
		System.out.println(i3.equals(i4)); //o. int값 비교. integer에서 오버라이드 됨.
		
		//사용하는 값이 참조타입인지 기본타입인지 잘 비교하면서 사용해야한다.
		
		System.out.println(i3.intValue() == i4.intValue()); //o
		
	}
}
