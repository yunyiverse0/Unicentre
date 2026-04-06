import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] remainders = new boolean[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int r = num % 42;
            remainders[r] = true;
        }

        for (int i = 0; i < 42; i++) {
            if (remainders[i]) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
