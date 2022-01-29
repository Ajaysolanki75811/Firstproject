    public class polymorphisamIntro extends objectIntro{
         void run1() {
             System.out.println("running");
         }
     }

     class Splendor extends polymorphisamIntro {
         void run1() {
             System.out.println("running safely with 60km");
         }

         public static void main(String args[]) {
             Intro i = new Intro();
//            new objectIntro();
//             polymorphisamIntro b = new Splendor();//upcasting
//             b.run1();
         }

 }