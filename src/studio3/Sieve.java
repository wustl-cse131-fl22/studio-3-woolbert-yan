package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input a number for the Sieve operation.");
		int n = in.nextInt();
		
		int[] numbers = new int[n];
		
		for (int num = 1; num <= n; num++) {
			numbers[num-1] = num;
		}
		
		for (int i : numbers) {
			
			boolean prime = true;
			
			for (int k = 1; k < i; k++) {
				if ((double)i / k == i/k && k != 1) {
					prime = false;
				}
				
			}
			
			if (prime && i != 1) {
				System.out.println(i);
			}
		}
		
		
	}
}
