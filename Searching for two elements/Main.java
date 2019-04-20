import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
      	arr[i]=in.nextInt();
      }
      int search1=in.nextInt();
      int search2=in.nextInt();
      int flag1=-1;
      int flag2=-1;
      for(int i=0;i<n;i++)
      {
      	if(search1==arr[i])
        {
        flag1=i;
        }
        if(search2==arr[i])
        {
        flag2=i;
        }
      }
      System.out.println(flag1);
      System.out.println(flag2);
    }
}