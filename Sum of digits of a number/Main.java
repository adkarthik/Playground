import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int sum=0,b=0;
      
      while(a>0)
      {
        b=a%10;
        sum=sum+b;
        a=a/10;
      }
      System.out.println(sum);
	}
}