package lec04;
import java.util.Scanner;

public class Q2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        String reversedStr = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        
        int resultInt = Integer.parseInt(reversedStr);
        
        System.out.println(resultInt);
        
        sc.close();
    }
}
