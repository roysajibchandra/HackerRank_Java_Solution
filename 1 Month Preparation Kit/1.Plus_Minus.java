import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static Scanner timtim = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // List<Integer> arr = new ArrayList<>();

        // for (int i = 0; i < n; i++) {
        //     int arrItem = Integer.parseInt(arrTemp[i]);
        //     arr.add(arrItem);
        // }

        // Result.plusMinus(arr);

        // bufferedReader.close();
        
        int N = timtim.nextInt();
        int[] arr = new int[N];
        int countN = 0;
        int countP = 0;
        int countZ = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = timtim.nextInt();
            if(arr[i]>0)
            {
                countP++;
            }
            else if(arr[i]<0)
            {
                countN++;
            }
            else 
            {
                countZ++;
            }
        }
        float plus = (float)countP/N;
        System.out.printf("%.6f\n",plus);
        float neg = (float) countN/N;
        System.out.printf("%.6f\n", neg);
        float zero = (float)countZ/N;
        System.out.printf("%.6f\n", zero);
    }
}
