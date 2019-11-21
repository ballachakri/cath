package Important_Java_Topics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * <p>
 *
 * </p>
 */
public class SystemPropertiesJava {

    public static void main(String[] args) throws IOException {

        System.out.println("Properties  :  "+System.getProperties());
        System.out.println("Environment  :  " +System.getenv());

        File f=new File("C:\\Users\\sball\\Desktop\\t1.txt");
        f.createNewFile();
        System.out.println(f.getName());
        System.out.println(f.getPath());

        FileWriter fw=new FileWriter("C:\\Users\\sball\\Desktop\\sam\\t1.txt",true);
        fw.write(100);
        fw.write("\n");
        fw.write("hello world");
        System.out.println("both");
        fw.flush();
        fw.close();

        FileWriter fw1=new FileWriter("C:\\Users\\sball\\Desktop\\sam\\t2.txt");
        BufferedWriter bwr=new BufferedWriter(fw1);
        bwr.write('a');
        bwr.write("\n");
        bwr.write("again hello world");
        bwr.flush();
        bwr.close();

    }
}
