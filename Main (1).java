import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int m = s1.nextInt();
        
        int i;
        for(i=n;i<=m;i++)
        {
            int z=i;
            int reversed=0;
            while(z!=0)
            {
                int rem = z%10;
                reversed = reversed*10 + rem;
                z = z/10;
            }
            if(reversed == i)
            {
                System.out.print(i+" ");
            }
        }
    }
}