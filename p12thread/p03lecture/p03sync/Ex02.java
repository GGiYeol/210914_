package p12thread.p03lecture.p03sync;

public class Ex02 {

	public static int value = 0;
	
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<10000; i++) {//for문안의 숫자가 커지면 join을 써도 값이 제대로 안나온다
					//why??
					value++;
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
		//t1, t2가 같은 일을 하니 value를 2000으로 만들고 싶다면??
		
		try {
			t1.join(); //일반 예외 발생시킴
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(value); //그냥 출력하면 0. 1000번 출력하기 전에 이미 출력을 해버림
	
	}
}
