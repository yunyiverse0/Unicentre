import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        
        System.out.println("Enter your email: ");
        String mail = sc.nextLine();
        
        System.out.println("Enter your User ID: ");
        String userID = sc.nextLine();

        System.out.println("=============================");
        System.out.printf("%22s\n", "Registration Complete!");
        System.out.println("=============================");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Email : " + mail);
        System.out.println("ID    : " + userID);
        System.out.println("=============================");
        System.out.println("Your registration was successful!");
        System.out.println("=============================");

        sc.close();
    }
}
