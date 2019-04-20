import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int i,b=0;
      for(i=1;b<a;i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
          b++;
        }
      }
	}
}