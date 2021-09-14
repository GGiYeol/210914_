package p12thread.p03lecture.p01thread;

import java.awt.Toolkit;

//같이 스레드를 실행시키고 싶을 떄에는 각각의 스레드를 만들고 main안에서 동시에 실행되게 해주면 된다.
public class Ex04 {
	public static void main(String[] args) {
		
		Thread t1 = new NumberThread();
		Thread t2 = new BeepThread();
		
		t1.start();
		t2.start();
		
	}
}

class NumberThread extends Thread {
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);//milli second만큼 멈추기. long값. 1000은 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}

class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
}
