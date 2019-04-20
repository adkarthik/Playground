import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
    arr[i]=in.nextInt();
    }
    int freq[]=new int[n];
    System.out.print(mostfreq(arr,n,freq));
  }
  public static int mostfreq(int arr[],int n,int freq[])
  {
  int max_count=0;
    int cur_count=1;
    for(int i=0;i<n;i++)
    {
    for(int j=i+1;j<n;j++)
    {
      if(arr[i]==arr[j])
      {
      cur_count++;
      }
    }
      freq[i]=cur_count;
      cur_count=1;
    }
    for(int i=0;i<n;i++)
    {
    if(freq[i]>freq[max_count])
    {
    max_count=i;
    }
    }
    return arr[max_count];
      
  }
}