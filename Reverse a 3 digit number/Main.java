import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code her
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int f=n/100;
    int m=((n/10)%10);
    int l=n%10;
    int rev=(l*100)+(m*10)+f;
    System.out.println(rev);
  }
}