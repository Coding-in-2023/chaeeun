import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] var = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i=0; i<9; i++) {
			var[i] = sc.nextInt();
		}
		
		for(int i=0; i<9; i++) {
			if(var[i]>max) {
				max = var[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
