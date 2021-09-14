package p12thread.p03lecture.p03sync;

public class Ex01 {
	//동시에 일어나기때문에 일어나는 문제점.
	public static int value = 0;

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<1000; i++) {
				}
				value++;
			}
		});
		//sysout이 t라는 스레드가 끝난다음에 쓰고 싶을때??? t.join
		t.start();
		try {
			t.join(); //t thread가 끝나길 기다림. t실행 후 sysout이 출력됨.
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //t thread가 끝나길 기다림
		
		System.out.println(value);
		System.out.println("프로그램 종료");
	}
		
	
}
