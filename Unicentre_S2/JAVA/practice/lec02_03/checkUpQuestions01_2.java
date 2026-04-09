package PRC;
import java.util.Scanner;

public class prc {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		
		System.out.println(sb);
		
		sc.close();
		
	}
}
