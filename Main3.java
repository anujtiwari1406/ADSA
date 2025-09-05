import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main3 {
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

       
        
        long xor = 0;
        Deque<Integer> dq = new ArrayDeque<>();

       for (int i = 0; i < n; i++) {
            
            while (!dq.isEmpty() && arr[dq.peekLast()] >= arr[i]) {
                dq.pollLast();
            }
            dq.addLast(i);

            
            if (dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            
            if (i >= k - 1) {
                xor ^= arr[dq.peekFirst()];
            }
        }

        System.out.println(xor);
    }
}

