import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb=new StringBuilder(A);  
        sb.reverse();  
        String rev=sb.toString();  
        if(A.equals(rev)){  
            System.out.println("Yes");  
        }
        else
        {  
            System.out.println("No");  
        }
        
    }
}



