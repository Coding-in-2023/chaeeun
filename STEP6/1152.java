import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	String sentence = sc.nextLine();
    	String[] result = sentence.split(" ");
    	
    	System.out.print(result.length);
    }
}
