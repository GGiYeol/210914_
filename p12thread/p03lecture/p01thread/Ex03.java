package p12thread.p03lecture.p01thread;

import java.awt.Toolkit;

public class Ex03 {

	public static void main(String[] args) {
		
		for(int i = 0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);//milli second만큼 멈추기. long값. 1000은 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
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
