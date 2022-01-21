import jdk.nashorn.internal.ir.Node;

public class Intro {
    private static Node greet;

    public static void main(String[] args) {
        String a = "Hello World";
        System.out.println("String is" + a);

        int length = greet.length();
        System.out.println("length is "+ length);
    }
}
