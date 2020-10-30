import java.util.*;
public class LineOfNum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the line of numbers: ");
        String str=s.nextLine();
        StringTokenizer st=new StringTokenizer(str);
        int n,sum=0;
        String temp;
        System.out.println("The nnumbers are: ");
        while(st.hasMoreTokens())
        {
            temp=st.nextToken();
            n=Integer.parseInt(temp);
            System.out.println(n);
            sum+=n;
        }
        System.out.println("Sum of numbers: "+sum);
    }
}