import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static char caesarCipher(char ch, int k) {
    // Write your code here
    
        if(!Character.isLetter(ch))
        {
            return ch;
        }
        char base = Character.isLowerCase(ch)? 'a':'A';
        return (char)((ch-base+k)%26+base);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner timtim = new Scanner(System.in);
        int length = timtim.nextInt();
        String str = timtim.next();
        int k = timtim.nextInt();
        
        StringBuilder sb = new StringBuilder();
        Result res = new Result();
        for(int i=0; i<length; i++)
        {
            char ch = str.charAt(i);
            sb.append(res.caesarCipher(ch, k));
        }
        System.out.println(sb);
        timtim.close();
    }
}
