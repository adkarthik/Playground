import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    int i,j;
    for(i=0;i<n;i++)
    {
    arr[i]=in.nextInt();
    }
    System.out.println(sum_seq(arr,n));
  }
  public static int sum_seq(int arr[],int n)
  {
  int run_sum,max_sum,i;
    run_sum=arr[0];
    max_sum=arr[0];
    for(i=1;i<n;i++)
    {
    if(arr[i]>arr[i-1])
    {
    run_sum+=arr[i];
    }
      else
      {
      run_sum=arr[i];
      }
      if(run_sum>max_sum)
      {
      max_sum=run_sum;
      }
    }
    return max_sum;
  }
}