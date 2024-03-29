import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();				//행
		int M = sc.nextInt();				//열
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] C = new int[N][M];		//행렬A+행렬B
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {			
				A[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {			
				B[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {			
				C[i][j] = A[i][j] + B[i][j];
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}
