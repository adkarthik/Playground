import java.util.*;
class Main
{
public static int power(int a,int b)
{
int pow=1;
  for(int i=1;i<=b;i++)
  {
    pow=pow*a;
  }
  return pow;
}
  public static void main(String[] args)
  {
  Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int p=power(n,m);
    System.out.println(p);
  }
}