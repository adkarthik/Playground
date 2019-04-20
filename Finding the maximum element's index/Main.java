import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
    arr[i]=in.nextInt();
    }
    int max=0,j=0;
    for(int i=0;i<n;i++)
    {
    if(max<arr[i])
    {
    j=i;
      max=arr[i];
    }
    }
    System.out.println(j);
  }
}