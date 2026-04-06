import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] baskets = new int[n];

        for (int x = 0; x < m; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int index = i - 1; index <= j - 1; index++) {
                baskets[index] = k;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(baskets[i] + " ");
        }

        sc.close();
    }
}
