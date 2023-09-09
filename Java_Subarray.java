import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner timtim = new Scanner(System.in);
        int N = timtim.nextInt();
        int[] array = new int[N];
        for(int i=0; i<array.length; i++)
        {
            array[i] = timtim.nextInt();
        }
        int count=0;
        for(int j=0; j<N; j++)
        {
            int sum=0;
            for(int k=j; k<N; k++)
            {
                sum+=array[k];
                if(sum<0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
