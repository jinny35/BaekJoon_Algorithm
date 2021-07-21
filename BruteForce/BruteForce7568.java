package BruteForce;

import java.util.Scanner;

public class BruteForce7568 {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[][] arr = new int[N][2];
		
		//키와 몸무게 입력
		for (int i = 0; i < N; i++) {
			arr[i][0] = input.nextInt(); // [i][0] : 몸무
			arr[i][1] = input.nextInt(); // [i][1] : 
		}
		
		for (int i = 0; i < N ; i++) {
			int rank = 1;
			
			for (int j = 0; j < N; j++) {
				if (i == j) continue; // 같은 사람은 비교하지 않
				
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			System.out.print(rank+" ");
		}
		input.close();
	}
}
