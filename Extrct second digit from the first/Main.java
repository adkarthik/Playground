import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=a;
    int count=0;
    int c=0;
    while(a>0)
    {
     a=a/10;
      count=count+1;
    }
    while(count>1)
    {
      c=b%10;
      b=b/10;
      count=count-1;
    }
    System.out.println(c);
  }
}