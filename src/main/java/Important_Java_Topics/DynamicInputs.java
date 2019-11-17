package Important_Java_Topics;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * <P>
 * Three ways to get the Dynamic inputs from user / console.
 * Using BufferedReader class
 * Using Scanner/System.in()
 * Using Console
 * </P>
 *
 */
public class DynamicInputs {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        Class c=Class.forName("com.company.javanet.DynamicInputs");
        Object o=c.newInstance();
        System.out.println(o.getClass());
        System.out.println(c.toString());
        System.out.println(o.hashCode());

        System.out.print("please enter:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        System.out.println(s);

        Scanner src=new Scanner(System.in);
        System.out.print("enter :");
        String s1=src.next();
        System.out.println(s1);

        Console cs=System.console();
        char[] p = cs.readPassword("enter password :");
        String up=new String(p);
        System.out.println(p);

    }
}
