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
        int T = timtim.nextInt();
        
        StringBuilder output = new StringBuilder("");
        querise:
        while(T-->0)
        {
            int N = timtim.nextInt();
            int K = timtim.nextInt();
            
            int[] A = new int[N];
            int[] B = new int[N];
            
            for(int i=0; i<N; i++)
            {
                A[i] = timtim.nextInt();
            }
            for(int i=0; i<N; i++)
            {
                B[i] = timtim.nextInt();
            }
            
            Arrays.sort(A);
            Arrays.sort(B);
            
            for(int j=0; j<N; j++)
            {
                if(A[j]+B[B.length-1-j]<K)
                {
                    output.append("NO\n");
                    continue querise;
                }
            }
            output.append("YES\n");
            
        }
        System.out.println(output);
    }
}
