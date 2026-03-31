import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.println("Enter your favorite number: ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter today's goal: ");
        String goal = sc.nextLine();

        int res = (age + num * 3) % 5;
        String recommendedGoal = "";

        if (res == 0) {
            recommendedGoal = "Studying English";
        } else if (res == 1) {
            recommendedGoal = "Studying Java";
        } else if (res == 2) {
            recommendedGoal = "Studying Organizational Behavior";
        } else if (res == 3) {
            recommendedGoal = "Studying Information Systems";
        } else if (res == 4) {
            recommendedGoal = "Studying Marketing";
        } else {
            recommendedGoal = "Exercise";
        }

        System.out.println("Entered Goal: " + goal);
        System.out.println("Recommended Goal: " + recommendedGoal);

        sc.close();
    }
}
