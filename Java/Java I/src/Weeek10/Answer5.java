package Weeek10;

public class Answer5 {
	public static void main(String[] args) {
		int[] cnt = {9, 4, 3, 6, 10, 2, 5};
		for(int v : cnt)
			histogram(v);
	}
	
	public static void histogram(int v) {
		System.out.print(v +"] ");
		for(int i = 0; i < v; i++)
			System.out.print('*');
		System.out.println();
	}
}
