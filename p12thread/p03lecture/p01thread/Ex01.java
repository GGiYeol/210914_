package p12thread.p03lecture.p01thread;

public class Ex01 {
	
	public static void main(String[] args) {
		//다른 thread도 같이 실행시키고 싶을때??? ->thread class를 이용
		OtherThread t1 = new OtherThread();
		t1.start(); //thread에는 start가 들어있음. 실행해야하는 메소드
		for(int i = 0; i<10000; i++) {
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
	}

}
//Thread 클래스 활용
class OtherThread extends Thread{
	@Override //동시에 하고 싶은 일은 run 메소드 안에 오버라이드 하면 된다.
	public void run() { //재정의해야하는 메소드
		System.out.println("다른 스레드 시작");
		for(int i = 10000_1000; i<10001_0000; i++) {
			System.out.println(i);
		}
		System.out.println("다른 스레드 종료");
	}
}
