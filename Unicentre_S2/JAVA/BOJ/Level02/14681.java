import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int res = 0;
        
        if (a > 0) {
            res = (b > 0) ? 1 : 4;
        } else {
            res = (b > 0) ? 2 : 3;
        }
        
        System.out.println(res);
        sc.close();
    }
}
