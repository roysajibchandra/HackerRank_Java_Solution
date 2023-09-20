import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    // Write your code here
        int totalfront = n/2;
        int targetfront = p/2;
        
        int page = totalfront - targetfront;
        
        return Math.min(page, targetfront);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner timtim = new Scanner(System.in);
        int n = timtim.nextInt();
        int p = timtim.nextInt();
        Result res = new Result();
        
        System.out.println(res.pageCount(n, p));
        timtim.close();
    }
}
