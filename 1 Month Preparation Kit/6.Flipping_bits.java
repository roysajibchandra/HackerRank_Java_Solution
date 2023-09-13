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
        while(T-->0)
        {
            long N = timtim.nextLong();
            long unsinged;
            
            N = ~N;
            unsinged = N & 0xffffffffL;
            System.out.println(unsinged);
        }
        timtim.close();
    }
}
