import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // List<List<Integer>> arr = new ArrayList<>();

        // for (int i = 0; i < 6; i++) {
        //     String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        //     List<Integer> arrRowItems = new ArrayList<>();

        //     for (int j = 0; j < 6; j++) {
        //         int arrItem = Integer.parseInt(arrRowTempItems[j]);
        //         arrRowItems.add(arrItem);
        //     }

        //     arr.add(arrRowItems);
        // }

        // bufferedReader.close();
        int a[][] = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        try (Scanner scanner = new Scanner(System.in);)
        {
            for(int i = 0; i < 6; i++)
            {
                for(int j = 0; j < 6; j++)
                {
                    a[i][j] = scanner.nextInt();
                    if (i > 1 && j > 1)
                    {
                        int sum =
                            a[i][j]
                            + a[i][j-1]
                            + a[i][j-2]
                            + a[i-1][j-1]
                            + a[i-2][j]
                            + a[i-2][j-1]
                            + a[i-2][j-2];
                        if (sum > maxSum) {maxSum = sum;}
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
