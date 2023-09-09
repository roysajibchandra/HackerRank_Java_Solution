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

        // String n = bufferedReader.readLine();
        Scanner timtim = new Scanner(System.in);
        BigInteger n = new BigInteger(timtim.next());

        // bufferedReader.close();
        timtim.close();
        System.out.println(n.isProbablePrime(10)? "prime":"not prime");
    }
}
