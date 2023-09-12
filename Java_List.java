import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner timtim = new Scanner(System.in);
        int N = timtim.nextInt();
        List<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<N; i++)
        {
            arr.add(timtim.nextInt());
        }
        
        int operation = timtim.nextInt();
        for(int j=0; j<operation; j++)
        {
            String S = timtim.next();
            if(S.equals("Insert"))
            {
                int index = timtim.nextInt();
                int value = timtim.nextInt();
                arr.add(index, value);
            }
            if(S.equals("Delete"))
            {
                int index = timtim.nextInt();
                arr.remove(index);
            }
        }
        
        for(int i=0; i<arr.size(); i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}
