package p12thread.p03lecture.p02runnable;

import java.awt.Toolkit;

public class Ex01 {

	public static void main(String[] args) {
		Runnable r1 = new NumberThread();
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(new NumberThread());
		t2.start();
		
		Thread t3 = new Thread(new BeepThread());
		t3.start();
	}
}
//Runnable인터페이스 활용
class NumberThread implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
//인터페이스기때문에 여러개를 상속 받을 수 있어서, 선호되는 방법이다.
class BeepThread implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000); //1초마다 소리 날 수 있게 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
