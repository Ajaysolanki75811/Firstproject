import java.util.Scanner;

public class palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int t=n;
        int rev = 0;
        while (n!=0)
        {
            rev = rev*10+(n%10);
            n=n/10;
        }
        if(rev==t)
        {
            System.out.println(t+" is a palindrom number");
        }
        else{
            System.out.println(t+" not palindrom number");
        }
    }
}