import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j,k;
      for(i=1;i<=n;i++)
      {
        for(k=i;k<n;k++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=((2*i)-1);j++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
      }
	}
}