package p12thread.p03lecture.p03sync;

public class Ex03 {
public static int value = 0;
public static Object o = new Object();
	
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<1000000; i++) {
					synchronized (o) { //안에 들어가는 객체는 바톤, 발언권 정도로 생각. 아무 객체나 선언해줘도 된다.
									   //o객체가 있는 스레드들만 코드가 실행된다. 사용하고 다시 jvm에 반납함.
						value++;						
					}
					//1. value 읽기 ->읽기 전용으로 사용하는 것이 좋다.
					//2. value 증가
					//3. value 쓰기 ->가능한한 쓰지 않은 것이 좋다.
				}
			}
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
		try {
			t1.join(); 	
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(value); 
	
	}

}
