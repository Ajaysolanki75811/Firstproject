public class Allexample {
    int z = 10;
    static int a = 100;
    static int b; //static varable
    static { //static block
        {
            System.out.println("static insidr non static block");
        }
        System.out.println("ststic block execute");
        //  b = a * 4;
    }
    {
        {
            System.out.println("inner non static block");
        }
        System.out.println("outer Non Static block");
    }
    static void add() { //static method
        System.out.println("Add part Enter");
        System.out.println("Static part enter");
    }
    void add1() {
        System.out.println("non static method");
    }
}
    class main1
    {
        int z = 700;
        public static void main (String[]args){
        Allexample.add(); //calling static method
        System.out.println("value of a =" + Allexample.a);
        Allexample a2 = new Allexample();
        System.out.println("Z new value " +new main1().z);
        System.out.println("main part =" + new Allexample().z);
        // add();
        new Allexample().add1();
        System.out.println("End of the main method");
        //print static value
        //System.out.println("value of b ="+b);
    }
    }
