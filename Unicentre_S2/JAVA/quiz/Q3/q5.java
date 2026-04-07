import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("닉네임을 입력하세요: ");
        String input = scanner.nextLine();
        
        String result = checkNickname(input);
        System.out.println("결과: " + result);
        
        scanner.close();
    }

    public static String checkNickname(String nickname) {
        String refined = nickname.trim();
        
        refined = refined.toLowerCase();
        
        refined = refined.replace(" ", "_");
        
        if (refined.contains("admin")) {
            return "invalid";
        }
        
        if (refined.length() < 3) {
            return "invalid";
        }
        
        return refined;
    }
}
