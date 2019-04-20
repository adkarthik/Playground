import java.util.Scanner;
class Main{
	public static void main (String[] args){
      
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int a=num;
      int sum=0;
      while(num>0)
      {
      int b=num%10;
        int count=1;
        for(int c=1;c<=b;c++)
        {
          count=count*c;
         }
        sum=sum+count;
        num=num/10;
      
      }
      if(sum==a)
      
      {
        System.out.println("Yes");
      }
      else
      {
      System.out.println("No");
      }
	}
}