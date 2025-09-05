import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

       
        String[] arrStr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        int[] result = new int[n - k + 1];
        HashMap<Integer, Integer> freq = new HashMap<>();

        int i = 0, j = 0;

        while (j < n) {
            freq.put(arr[j], freq.getOrDefault(arr[j], 0) + 1);

            if (j - i + 1 == k) {
                result[i] = freq.size();
                freq.put(arr[i], freq.get(arr[i]) - 1);
                if (freq.get(arr[i]) == 0) {
                    freq.remove(arr[i]);
                }
                i++;
            }
            j++;
        }

        StringBuilder sb = new StringBuilder();
        for (int l = 0; l < result.length; l++) {
            sb.append(result[l]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}



// import java.util.HashMap;
// import java.util.Scanner;

// public class Main4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int[] result = new int[n - k + 1];
//         HashMap<Integer, Integer> freq = new HashMap<>();

//         int i = 0, j = 0; 

//         while (j < n) {
            
//             freq.put(arr[j], freq.getOrDefault(arr[j], 0) + 1);

            
//             if (j - i + 1 == k) {
//                 result[i] = freq.size();  

               
//                 freq.put(arr[i], freq.get(arr[i]) - 1);
//                 if (freq.get(arr[i]) == 0) {
//                     freq.remove(arr[i]);
//                 }
//                 i++;
//             }
//             j++;
//         }

//         for (int l = 0; l < result.length; l++) {
//             System.out.print(result[l] + " ");
//         }
//     }
// }
