import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        Long[] answer = new Long[T];

        for (int i = 0; i < T; i++) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = kb.nextInt();
            }

            int max = 0;
            long tmp = 0;
            for (int k = n - 1; k >= 0; k--) {
                if (max < arr[k]) {
                    max = arr[k];
                } else {
                    tmp += max - arr[k];
                }
            }
            answer[i] = tmp;
        }

        for (long num : answer) {
            System.out.println(num);
        }

    }
}