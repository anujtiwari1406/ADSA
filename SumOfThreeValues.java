
import java.util.HashMap;
import java.util.Scanner;

public class SumOfThreeValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int target = x - arr[i];
            HashMap<Integer , Integer> seen = new HashMap<>();
            for(int j = i + 1; j < n; j++){
                int need = target - arr[j];
                if(seen.containsKey(need)){
                    System.out.println((i + 1) + " "  + (seen.get(need) + 1) + " " + (j + 1));
                    return;
                }else{
                    seen.put(arr[j], j);

                }
            }


        }
        System.out.println("IMPOSSIBLE");
    }
    
}
