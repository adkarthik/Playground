import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here'
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int str_len=sb.length();
      int freq[]=new int[26];
      for(int i=0;i<26;i++)
      {
      freq[i]=0;
      }
      for(int i=0;i<str_len;i++)
      {
      if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
      {
      freq[sb.charAt(i)-'A']++;
      }
        if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
      {
      freq[sb.charAt(i)-'a']++;
      }
        
      }
      for(int i=0;i<=25;i++)
      {
      if(freq[i]==0)
      {
      char ma=(char)(i+'a');
        System.out.print(ma+" ");
      }
      }
    }
}