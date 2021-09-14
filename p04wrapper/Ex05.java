package p11api.p03lecture.p03object.p04wrapper;

public class Ex05 {

	
	public static void main(String[] args) {
		
		int i1 = 300; //null값을 가질 수 없음
		Integer i2 = 300; //null값을 가질 수 있음(참조타입)
		
//		i1 = null; //x
		i2 = null; //o
		
		short s1 = 100;
		Short s2 = 100;
		
		i1 = s1; //o(자동 형변환)->기본타입이기 때문
//		i2 = s2; //x(api참조)
//		i2 = (Integer) s2; //당연히 안됨(개 ->고양이 바꿀 수 없음)
		i2 = s2.intValue(); //자동박싱이 일어남.
		
		int i3 = i2 + 100; //auto unboxing
		System.out.println(i3);
		
		Object o1 = i2;
		i2 = (Integer)o1;//다형성
		
	}
}
