import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        String s = sc.next();
        
        int res = 0;
        
        for (int i = 0; i < t; i++) {
            res += s.charAt(i) - '0';
        }
        
        System.out.println(res);
        
        sc.close();
    }
}
