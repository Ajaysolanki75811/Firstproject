import java.util.Scanner;

public class multiplcation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = s.nextInt();
        for (int d = 1; d <= n; d++) {
            for (int e = 1; e <= 10; e++) {
                System.out.print(d + "*" + e + "=" + e * d + "\t");
            }
        }
        System.out.println();
    }
}
