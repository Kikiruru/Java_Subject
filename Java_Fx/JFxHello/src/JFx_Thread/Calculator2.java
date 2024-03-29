package JFx_Thread;

public class Calculator2 {

	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { // 계산기 메모리에 값을 저장하는 메소드
		this.memory = memory; // 매개값을 memory 필드에 저장

		try { // 스레드를 2초간 정지시킴
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		// 스레드 이름과 메모리값
	}
}
