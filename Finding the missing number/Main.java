import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
      arr[i]=in.nextInt();
      }
      int miss_val=0;
      for(int i=1;i<=n;i++)
      {
      boolean is_found=false;
        for(int j=0;j<n;j++)
        {
        if(arr[j]==i)
        {
        is_found=true;
          break;
        }
        }
        if(is_found==false)
        {
        miss_val=i;
          break;
        }
      }
      System.out.println(miss_val);
    }
}