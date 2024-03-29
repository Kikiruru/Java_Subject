package JFx_Thread;

public class User1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1"); // 스레드 이름을 User1로 설정
		this.calculator = calculator; // 공유 객체인 calculator를 필드에 저장
	}

	public void run() {
		calculator.setMemory(100); // 공유 객체인 calculator를 필드에 100을 저장
	}
}
