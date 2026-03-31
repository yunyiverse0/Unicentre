import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		int i = max;
		int cnt = 0;
		
		while (i > 0) {
			System.out.printf("%4d", i);
			i --;
			cnt ++;
			
			if (cnt == 10) {
				System.out.println();
				cnt = 0;
			}
			
		}
				
		sc.close();
	}
}
