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
		int left=0;
      int right=n-1;
      boolean palin=true;
      while(left<right)
      {
      if(arr[left]!=arr[right])
      {
      palin=false;
        break;
      }
        left++;
        right--;
      }
      if(palin==true)
      {
      System.out.println("Yes");
      }
      else
      {
      System.out.println("No");
      }
    }
}