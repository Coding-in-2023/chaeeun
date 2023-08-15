import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = (int)Math.pow(2, N) + 1;
        System.out.println(result * result);
    }
}

/* 입력: 1(N)이면 출력 9여야 함. 2의 1(N)승 = 2에다가 1 더해서 = 3을 제곱하면 9
*  반복해서, 입력 2(N)이면 출력 25여야 함. 2의 2(N)승 = 4에다가 1 더해서 5을 제곱하면 25*/
