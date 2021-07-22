package BruteForce;

import java.util.Scanner;

public class BruteForce1018 {

	public static boolean[][] arr;
	public static int min = 64;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int M = input.nextInt();
		
		arr = new boolean[N][M];
		
		//Scanner 경우 개행으로 입력되면 개행이 그대로 남아있다.
		input.nextLine();
		
		for (int i = 0; i < N; i++) {
			//trim() : 공백제거
			String str = input.nextLine().trim();
			
			for (int j = 0; j< M; j++) {
				if (str.charAt(j) == 'W' ) {
					arr[i][j] = true;
				}
				else {
					arr[i][j] = false;
				}
			}
		}
		
		int N_row = N - 7;
		int M_col = M - 7;
		
		for (int i = 0; i < N_row; i++) {
			for (int j = 0; j < M_col; j++) {
				find(i,j);
			}
		}
		System.out.println(min);
		input.close();
	}
	
	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
		
		boolean TF = arr[x][y];
		
		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {
				//올바른 색이 아닐 경우 count 1 증
				if (arr[i][j] != TF) {
					count++;
				}
				
				// 다음 칸은 색이 바뀐다.
				TF = (!TF);
			}
			TF = !TF;
		}
		
		//색칠할 개수 최솟값을 count에 저장 
		count = Math.min(count, 64 - count);
		
		//현재 count값이 더 작을 경우 최솟값을 갱신 
		min = Math.min(min, count);
		
	}

}
