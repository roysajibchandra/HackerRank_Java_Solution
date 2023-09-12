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
        ArrayList<ArrayList> arr = new ArrayList<>();
        
        for(int i=0; i<N; i++)
        {
            int d = timtim.nextInt();
            ArrayList<Integer> subarr = new ArrayList<>();
            
            for(int j=0; j<d; j++)
            {
                subarr.add(timtim.nextInt());
            }
            arr.add(subarr);
        }
        
        int q = timtim.nextInt();
        for(int i=0; i<q; i++)
        {
            int x = timtim.nextInt();
            int y = timtim.nextInt();
            
            try{
            System.out.println((arr.get(x-1)).get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
        
        
        
    }
}
