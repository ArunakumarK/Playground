import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        for(int divisor=1;divisor<=n;divisor++)
        {
          if(n%divisor==0)
          {
           

          System.out.println(divisor);
          }
          
        }
        
	}
}