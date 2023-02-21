import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int temp = N / 4;   //입력받은 수를 4로 나눈 만큼 long 출
    	
    	for (int i = 0; i < temp; i++) {
    		System.out.print("long ");
    	}
    	
    	System.out.println("int");
    	
    }
}
