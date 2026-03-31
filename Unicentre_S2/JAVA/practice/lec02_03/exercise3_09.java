import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        do {
            System.out.println("Current number: " + num);
            num *= 2;
        } while (num < 100);
        
        System.out.println("Program finished (Value reached: " + num + ")");
                
        sc.close();
    }
}
