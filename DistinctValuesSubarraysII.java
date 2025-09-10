
import java.util.HashMap;
import java.util.Scanner;

public class DistinctValuesSubarraysII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        int total = 0;
        int i = 0;
        for(int j = 0; j < n; j++){
            freq.put(arr[j] , freq.getOrDefault(arr[j] , 0) + 1);
            while(freq.size() > k){
                freq.put(arr[i] , freq.get(arr[i]) - 1);
                if(freq.get(arr[i]) == 0){
                    freq.remove(arr[i]);
                }
                i++;
            }
            total += j - i + 1;


        }
        System.out.println(total);
        sc.close();

        
    }
}
