import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        
        Scanner timtim = new Scanner(System.in);
        int N = timtim.nextInt();
        int[][] arr = new int[N][N];
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                arr[i][j] = timtim.nextInt();
            }
        }
        int sum=0, sum1=0;
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<=i; j++)
            {
                if(i==j)
                    sum += arr[i][j];
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<=i; j++)
            {
            
                sum1 += arr[i][N-i-1];
            }
        }
        System.out.println(Math.abs(sum-sum1));

        timtim.close();
    }
}
