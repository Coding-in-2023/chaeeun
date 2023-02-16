import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	int count = 0;
    	
    	for (int i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i);
    		
    		if ((ch == 'c' || ch == 'd' || ch == 'l' || ch == 'n' || ch == 's' || ch == 'z')
    				&& (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-' || str.charAt(i + 1) == 'j' || str.charAt(i + 1) == '=')) {
    			count++;
    			i++;
    		}
    		else if ((ch == 'd' && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=')) {
    			count++;
    			i += 2;
    		}
    		else {
    			count++;
    		}
    	}
    	System.out.println(count);
    }
}
