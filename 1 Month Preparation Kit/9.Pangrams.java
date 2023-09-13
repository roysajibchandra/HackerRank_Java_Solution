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
        String S = timtim.nextLine().toLowerCase();
        boolean res = true;
        
        for(char i='a'; i<='z'; i++)
        {
            if(S.indexOf(i)==-1)
            {
                res = false;
                break;
            }
        }
        System.out.println(res? "pangram": "not pangram");
       
    }
}
