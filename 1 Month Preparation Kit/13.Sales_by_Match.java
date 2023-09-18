import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner timtim = new Scanner(System.in);
        int n = timtim.nextInt();
        
        HashMap inventory = new HashMap<Integer,Integer>();
        
        int matchingPairs = 0;
        
        for(int i=0; i < n; i++)
        {
            int color = timtim.nextInt();
            
            //This checks if we already have 1 sock of that color and if we do then we increment matchingPairs and set unmatched               
            //socks of that color back to 0
            if(inventory.containsKey(color) && inventory.get(color).equals(new Integer(1)))
            {
                inventory.put(color,0);
                matchingPairs++;
                continue;
            }
            inventory.put(color,1);
        }
        System.out.println(matchingPairs);
        timtim.close();
        
    }
}
