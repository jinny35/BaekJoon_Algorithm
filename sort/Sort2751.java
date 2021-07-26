package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort2751 {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        boolean[] arr = new boolean[2000001];

        for (int i = 0; i < N; i++){
            arr[Integer.parseInt(in.readLine()) + 1000000] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                System.out.println(i - 1000000);
            }
        }

    }
}
