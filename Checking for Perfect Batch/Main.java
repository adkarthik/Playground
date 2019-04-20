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
      perfect(arr,n);
  }
  public static void perfect(int arr[],int n)
  {
  boolean per=true;
    int ba=arr[0]+arr[1]+arr[2];
    for(int i=3;i<=n-1;i=i+3)
    {
    int cr=arr[i]+arr[i+1]+arr[i+2];
      if(cr!=ba)
      {
      per=false;
      }
    }
    if(per==true)
    {
    System.out.println("Perfect Batch");
    }
    else
    {
    System.out.println("Not a Perfect Batch");
    }
    
  }
}