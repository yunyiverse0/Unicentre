package PRC;
import java.util.Scanner;

public class prc {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num1 = num;
		int num2 = num;
		int k = 0;
		if (num != 0) {
			k = 1;
		}
		int a = 0;
		int res = 0;
		
		while ( num1 >= 10) {
			num1 = num1/10;
			k++;
		}
		
		while (num2 > 0) {
			a = num2 % 10;
			res += Math.pow(a, k);
			num2 /= 10;
		}
		
		if (num == res) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}
		System.out.println(k);
		System.out.println(a);
		System.out.println(res);
		
		sc.close();
		
	}
}
