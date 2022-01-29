public class Inheritance {
    float salery=15000;
}
class prog extends Inheritance{
    int bounsac = 12345;

    public static void main(String args[]){
    prog p = new prog();
    System.out.println("salery is=" +p.salery);
    System.out.println("bounac is="+p.bounsac);

    }
        }
