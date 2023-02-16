/*
//I have it = 3인데 
//I  have it (I와 have 사이 띄어쓰기 2번)으로 하면 3이 아니라 4가 나옴
//그래서 split() 말고 StringTokenizer 클래스 함수를 이용함
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	String sentence = sc.nextLine();
    	String[] result = sentence.split(" ");
    	
    	System.out.print(result.length);
    }
}
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	String sentence = sc.nextLine();
    	StringTokenizer st = new StringTokenizer(sentence);
    	
    	System.out.println(st.countTokens());
    }
}
