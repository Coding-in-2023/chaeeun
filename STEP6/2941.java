/*
//런타임 에러 떴는데 이유는 abc=dcd라고 가정하면
//마지막 d 다음 문자는 없기 때문에 에러 발생한 거였음.
//그래서 문자열 길이 - 1 반복문 추가해주고
//dz=는 문자열 길이 - 2 반복문 추가해줬음.
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
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	int count = 0;
    	
    	for (int i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i);
    		
    		if (ch == 'c') {
    			if (i < str.length() - 1) {
    				if (str.charAt(i + 1) == '=') {
        				i++;
        			}
        			else if (str.charAt(i + 1) == '-') {
        				i++;
        			}
    			}
    		}
    		else if (ch == 'd') {
    			if (i < str.length() - 1) {
    				if (str.charAt(i + 1) == 'z') {
    					if (i < str.length() - 2) {
    						if (str.charAt(i + 2) == '=') {
            					i += 2;
            				}
    					}
        			}
        			else if (str.charAt(i + 1) == '-') {
        				i++;
        			}
    			}	
    		}
    		else if (ch == 'l') {
    			if (i < str.length() - 1) {
    				if (str.charAt(i + 1) == 'j') {
        				i++;
        			}
    			}	
    		}
    		else if (ch == 'n') {
    			if (i < str.length() - 1) {
    				if (str.charAt(i + 1) == 'j') {
        				i++;
        			}
    			}
    		}
    		else if (ch == 's') {
    			if (i < str.length() - 1) {
    				if (str.charAt(i + 1) == '=') {
        				i++;
        			}
    			}
    		}
    		else if (ch == 'z') {
    			if (i < str.length() - 1) {
    				if (str.charAt(i + 1) == '=') {
        				i++;
        			}
    			}		
    		}
    		count++;
    	}
    	System.out.println(count);
    }
}
