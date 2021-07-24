package sort;

import java.util.Scanner;

public class Sort2750 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        /*
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        //Bubble sort
        for (int i = 0; i < N - 1; i++){
            for (int j = i + 1; j < N; j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int val : arr) {
            System.out.print(val);
        }
        */

        //Counting sort
        // range : -1000 ~ 1000
        boolean[] arr = new boolean[2001];

        for (int i = 0; i < N; i++){
            arr[in.nextInt() + 1000] = true;
        }

        for (int i = 0; i < 2001; i++) {
            if (arr[i]) {
                System.out.println(i - 1000);
            }
        }

        in.close();
    }
}
