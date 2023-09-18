import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner timtim = new Scanner(System.in);
        
        
        try{
            int X = timtim.nextInt();
            int Y = timtim.nextInt();
            System.out.println(X/Y);
        }catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
        // catch(InputMismatchException e)
        // {
        //     System.out.println("java.util.InputMismatchException");
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println("java.lang.ArithmeticException: / by zero");
        // }
        timtim.close();
    }
}
