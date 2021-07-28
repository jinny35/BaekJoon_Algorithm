package sort;

import java.util.*;

public class Sort2108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        //배열에 입력
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        //산술평균
        double mean = 0;
        for (int i = 0; i < N; i++) {
            mean += arr[i];
        }
        System.out.println((int) Math.ceil(Math.round(mean / N)));

        //중앙값
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        if (N % 2 == 0) {
            System.out.println((arr[(N - 2) / 2] + arr[(N / 2) / 2]));
        } else {
            System.out.println(arr[(N - 1) / 2]);
        }

        //최빈값
        ArrayList<Integer> modeList = new ArrayList<Integer>();
        int cnt[] = new int[8001];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                cnt[Math.abs(arr[i]) + 4000]++;
            } else {
                cnt[arr[i]]++;
            }
        }

        //int index = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0 && cnt[i] > max) {
                max = cnt[i];
                //index = i;
            }
        }

        //System.out.println(max);

        for (int i = 0; i < cnt.length; i++) {
            int x = i;
            if (cnt[i] == max) {
                if (i > 4000) {
                    x -= 4000;
                    x *= -1;
                    modeList.add(x);
                } else {
                    modeList.add(i);
                }
            }

        }
        Collections.sort(modeList);

        if (modeList.size() > 1) {
            System.out.println(modeList.get(1));
        } else {
            System.out.println(modeList.get(0));

        }
        //범위
        System.out.println(arr[N - 1] - arr[0]);

        in.close();
    }
}
