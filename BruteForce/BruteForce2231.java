package BruteForce;

import java.util.Scanner;

public class BruteForce2231 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int M = input.nextInt();
		
		int result = 0;
		
		for (int i = 0; i < M; i++) {
			int number = i;
			int sum = 0;
			
			while(number !=0) {
				sum += number % 10;
				number /= 10;
			}
			
			if (sum + i == M) {
				result = i;
				break;
			}
		}
		input.close();
		System.out.println(result);
	}
}
