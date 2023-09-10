import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// class Result {

//     /*
//      * Complete the 'timeConversion' function below.
//      *
//      * The function is expected to return a STRING.
//      * The function accepts STRING s as parameter.
//      */

//     public static String timeConversion(String s) {
//     // Write your code here

//     }

// }

public class Solution 
{
    static void print24(String str)
    {
        // Get hours
        int h1 = (int)str.charAt(1) - '0';
        int h2 = (int)str.charAt(0) - '0';
        int hh = (h2 * 10 + h1 % 10);
 
        // If time is in "AM"
        if (str.charAt(8) == 'A')
        {
            if (hh == 12)
            {
                System.out.print("00");
                for (int i = 2; i <= 7; i++)
                {
                    System.out.print(str.charAt(i));
                }
                    
            }
            else
            {
                for (int i = 0; i <= 7; i++)
                {
                    System.out.print(str.charAt(i));
                }
                    
            }
        }
 
        // If time is in "PM"
        else
        {
            if (hh == 12)
            {
                System.out.print("12");
                for (int i = 2; i <= 7; i++)
                {
                    System.out.print(str.charAt(i));
                }
            }
            else
            {
                hh = hh + 12;
                System.out.print(hh);
                for (int i = 2; i <= 7; i++)
                {
                    System.out.print(str.charAt(i));
                }
                    
            }   
        }
    }
    public static Scanner timtim = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String s = bufferedReader.readLine();

        // String result = Result.timeConversion(s);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
        
        String time = timtim.next();
        print24(time);
        
    }
}
