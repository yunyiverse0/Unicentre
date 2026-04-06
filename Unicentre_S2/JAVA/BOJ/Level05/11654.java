import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        char ch = s.charAt(0);
        
        int result = ch;
        
        System.out.println(result);
        
        sc.close();
    }
}
