import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner timtim = new Scanner(System.in);
        
        try{
            BigInteger A = new BigInteger(timtim.next());
            BigInteger B = new BigInteger(timtim.next());
            
            BigInteger sum = A.add(B);
            BigInteger multipy = A.multiply(B);
            
            System.out.println(sum);
            System.out.println(multipy);
        }   
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            timtim.close();
        }
    }
}
