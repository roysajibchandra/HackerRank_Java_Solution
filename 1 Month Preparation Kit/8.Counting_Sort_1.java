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
        int[] arr = new int[100];
        for(int i=0; i<T; i++)
        {
            int num = timtim.nextInt();
            arr[num] +=1;
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        timtim.close();
    }
}
