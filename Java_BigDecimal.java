import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        for (int i = 0; i < n-1; i++) 
        {
            int minIdx =i;
            for (int j = i+1; j < n; j++) 
            {
                String s1 = s[minIdx];
                String s2 = s[j];
                BigDecimal b1 = new BigDecimal(s1);
                BigDecimal b2 = new BigDecimal(s2);
                if(b1.compareTo(b2)<0)
                {
                    minIdx = j;
                }
            }
            String temp = s[i];
            s[i] = s[minIdx];
            s[minIdx] = temp;
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
