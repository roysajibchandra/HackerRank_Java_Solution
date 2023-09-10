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

        // String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // List<Integer> arr = new ArrayList<>();

        // for (int i = 0; i < 5; i++) {
        //     int arrItem = Integer.parseInt(arrTemp[i]);
        //     arr.add(arrItem);
        // }

        // Result.miniMaxSum(arr);

        // bufferedReader.close();
        
        long[] arr = new long[5];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = timtim.nextLong();
        }
        Arrays.sort(arr);
        long minsum = arr[0]+arr[1]+arr[2]+arr[3];
        long maxsum = arr[4]+arr[1]+arr[2]+arr[3];
        
        System.out.print(minsum+" ");
        System.out.println(maxsum);
    }
}
