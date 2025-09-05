import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                int k = sc.nextInt();
                int x = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

        int[] arr = new int[n];
        arr[0] = x;

        
        for (int i = 1; i < n; i++) {
            arr[i] = (int)(((long)a * arr[i - 1] + b) % c);
        }

        int i = 0, j = 0;
        long sum = 0;
        long xor = 0;

        while (j < n) {
            sum += arr[j];

            if (j - i + 1 == k) {
                xor ^= sum;
                sum -= arr[i];
                i++;
            }
            j++; 
        }

        System.out.println(xor);
    }
}
