public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Using For Loop (Z to A) ---");
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        System.out.println("--- Using While Loop (Z to A) ---");
        char ch = 'Z';
        while (ch >= 'A') {
            System.out.print(ch + " ");
            ch--;
        }
        System.out.println();
        
    }
}
