package BruteForce;

import java.util.Scanner;

public class BruteForce1436 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		int num = 666;
		int count = 1;
		
		while (count != N) {
			num++;
			
			if (String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);

	}

}
