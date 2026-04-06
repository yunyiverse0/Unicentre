import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n];
        int max = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            if (s[i] > max) {
                max = s[i];
            }
            sum += s[i];
        }

        double result = (double) sum * 100 / max / n;

        System.out.println(result);

        sc.close();
    }
}
