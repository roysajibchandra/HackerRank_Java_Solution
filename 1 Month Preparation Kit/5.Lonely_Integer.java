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
        
        int res = 0;
        
        for(int i=0; i<T; i++)
        {
            res ^= timtim.nextInt();
        }
        
        System.out.println(res);
        timtim.close();
    }
}
