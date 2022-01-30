import java.lang.String;
import java.util.Scanner;
public class swap {
            static String counter(String str){
            char[] ch =str.toCharArray();
            for (int i=0;i< ch.length;i++)
            {
                int k =i;
                while (i < ch.length && ch[i] != ' ')
                i++;
                char t =ch[k];
                ch[k]=ch[i-1];
                ch[i-1]=t;

            }
                return new String(ch);
            }
            public static void main(String[] args)
            {
                String str = "HELLO";
                System.out.println(counter(str));
            }
}
