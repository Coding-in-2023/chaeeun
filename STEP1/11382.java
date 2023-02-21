import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	long A = sc.nextLong(); //sc.nextInt()로 하면 런타임 오류
    	long B = sc.nextLong();
    	long C = sc.nextLong();
    	
    	System.out.println(A+B+C);
    	
    }
}
