package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sort10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int[] arr = new int[20000001];

        for (int i=0; i<N; i++){
            arr[Integer.parseInt(in.readLine()) + 10000000]++;
        }

        in.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 20000001; i++) {
            while(arr[i]>0){
                //System.out.println(i - 10000000);
                sb.append(i-10000000).append('\n');
                arr[i]--;
            }
        }
        System.out.println(sb);
    }
}
