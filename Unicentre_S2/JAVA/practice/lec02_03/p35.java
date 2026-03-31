package lec02_03;
import java.util.Scanner;
import java.util.Random;

public class p35 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.println("How many times would you like to roll the dice?");
        int roll = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= roll; i++) {
            int dice = rd.nextInt(6) + 1;
            sum += dice;
            System.out.println("Roll #" + i + ": " + dice);           
        }
        
        System.out.println("--------------------");
        System.out.println("Total Sum: " + sum);
                
        sc.close();
    }
}
