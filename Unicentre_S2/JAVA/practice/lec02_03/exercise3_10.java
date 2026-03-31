public class Main {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 200; i += 10) {
            for (int j = 0; j < 10; j++) {
                int num = i + j;
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
        
    }
}
