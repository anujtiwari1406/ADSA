
import java.util.Scanner;

public class BoatsCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int[] weightFreq = new int[n + 1];
            for(int weight : arr){
                weightFreq[weight]++;
            }

             int answer = 0;
           for(int s = 0; s <= 2 * n ; s++){
              int pairs = 0;
                for(int x = 0; x <= n; x++){
                   

                    int y = s - x;
                    if(y < 1 || y > n) continue;

                    if(x < y){
                        pairs += Math.min(weightFreq[x] , weightFreq[y]);
                    }else if(x == y){
                        pairs += weightFreq[x] / 2;
                    }
                    
                }
                
                answer = Math.max(answer , pairs);
            }
              System.out.println(answer);
            

        }
    }
}