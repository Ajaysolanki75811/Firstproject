import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) throws AgeInvalid {
        int arr[]={11,22,33};
                for(int a:arr){
                    System.out.println(a);
                }
                int a3[] = new int[5];
                a3[0]=10;
                a3[1]=20;
                a3[2]=30;
                a3[3]=40;
                a3[4]=50;
                for(int j=0;j<a3.length;j++){
                    System.out.println(a3[j]);
                }
        Scanner s = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter your number");
        int n=s.nextInt();
        if(isPrime(n)){
            System.out.println(n +"is a prime number");
        }
        else
        {
            System.out.println(n+" is not prime number");
        }
        System.out.println("Enter Your Name");
        name=s.next();
        System.out.println("Enter Your Age");
        age=s.nextInt();
        if(age>=18)
        {
                System.out.println(name +" is eligible for voting");
        }
        else {
           throw new AgeInvalid("not valid for voting");
            //System.out.println(name +" is not eligible for voting");
        }
    }
    public static boolean isPrime(int n){
        if (n<=1){
          return false;
        }for(int i =2;i<Math.sqrt(n);i++){
             if(n%i==0){
              return false;
         }
        }return  true;
    }
}
