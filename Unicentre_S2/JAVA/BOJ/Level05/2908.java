import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String A = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            A += a.charAt(i);
        }

        String B = "";
        for (int i = b.length() - 1; i >= 0; i--) {
            B += b.charAt(i);
        }

        int numA = Integer.parseInt(A);
        int numB = Integer.parseInt(B);

        if (numA > numB) {
            System.out.println(numA);
        } else {
            System.out.println(numB);
        }

        sc.close();
    }
}
