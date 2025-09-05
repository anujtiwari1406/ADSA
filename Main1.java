import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sereja = 0;
        int dima = 0;
         int left = 0;
         int right = n - 1;
         boolean turn = true; 
        while(left <= right) {
            if(arr[left] > arr[right]) {
                if(turn) {
                    sereja += arr[left];
                    left++;
                } else {
                    dima += arr[left];
                    left++;
                }
            } else {
                if(turn) {
                    sereja += arr[right];
                    right--;
                } else {
                    dima += arr[right];
                    right--;
                }
            }
            turn = !turn;
        }
        
         System.out.println(sereja + " " + dima);

    }
    
}
