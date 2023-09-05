import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner timtim = new Scanner(System.in);
		int testCases = Integer.parseInt(timtim.nextLine());
		while(testCases-->0){
			String pattern = timtim.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(Exception e)
            {
                System.out.println("Invalid");
            }
          	// //Write your code
        
	    }
    }
}



