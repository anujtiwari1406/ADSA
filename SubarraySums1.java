
import java.util.Scanner;

public class SubarraySums1 {
     public  static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int x = sc.nextInt();
         int[] a = new int[n];
          for(int i = 0; i < n; i++) {
              a[i] = sc.nextInt();
          }
          int curSum = 0;
          int count = 0;
          int i = 0;
          for(int j = 0; j < n; j++){
             curSum += a[j];
                while(curSum > x && i <= j){
                    curSum -= a[i];
                    i++;
                
                    
                }
                if(curSum == x){
                        count++;
                }  
            }
            System.out.println(count);
                    

          
     }
}