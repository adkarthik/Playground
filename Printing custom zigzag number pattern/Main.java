import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
     int k=i%2;
        for(int j=1;j<=n;j++ )
        {
        if((j==n)&&(k==1))
          System.out.print(i+1);
        
        else if((j==1)&&(k==0))
          System.out.print(i+1);
        else
          System.out.print(i);
      }
        System.out.print("\n");
	}
    }}