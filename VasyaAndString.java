// https://codeforces.com/problemset/problem/1399/C



import java.util.Scanner;
public class VasyaAndString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int ansA = LongestSubstring(s, n, k, 'a');
        int ansB = LongestSubstring(s, n, k, 'b');
        System.out.println(Math.max(ansA, ansB));
        sc.close();

    }
    public static int LongestSubstring(String s, int n , int k , char target) {
        int left = 0, right = 0;
        int badcount = 0;
        int maxlen = 0;
        while(right < n){
            if(s.charAt(right) != target){
                badcount++;
            }
            while(badcount > k){
                if(s.charAt(left) != target){
                    badcount--;
                }
                left++;
            }
                
            maxlen = Math.max(maxlen, right - left + 1);
            right++;
        }
        return maxlen;
    }
       
}