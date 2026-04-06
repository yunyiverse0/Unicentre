import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] a = new int[26];
        for (int i = 0; i < 26; i++) {
            a[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
            
            if (a[index] == -1) {
                a[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(a[i] + " ");
        }
        
        sc.close();
    }
}
