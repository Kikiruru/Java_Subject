package Week02;

public class a2 {
	public static void main(String[] args) {
		//구구단 출력
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
}

