import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int count=3;
    for(int i=1;i<=a;i++)
    {
      System.out.print(i);
    if(i%count==0 && i!=a)
      System.out.print(",");
  }}
}