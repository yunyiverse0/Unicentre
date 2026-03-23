import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();

        int totalMinutes = (h * 60 + m) - 45;
        
        if (totalMinutes < 0) {
            totalMinutes += 24 * 60; // 전날로 넘어가는 경우
        }

        int resH = totalMinutes / 60;
        int resM = totalMinutes % 60;
        
        System.out.println(resH + " " + resM);
        sc.close();
    }
}
