abstract class abstractintro {

  abstract void run();

}

class honda extends abstractintro{
    void run(){
        System.out.println("runing safe");
    }
    public static void main(String args[]){
        abstractintro ab1= new honda();
        ab1.run();
    }
}
