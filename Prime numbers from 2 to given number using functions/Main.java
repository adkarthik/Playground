import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
	}
  public static int prime(int num)
  {
    for(int j=2;j<=num;j++)
    {
      int count=1;
  	for(int i=2;i<j;i++)
    {
      if(j%i==0)
        count =count+1;
    }
      if(count==1)
      {
        System.out.println(j);
      }
  }
    return 0;
}}
