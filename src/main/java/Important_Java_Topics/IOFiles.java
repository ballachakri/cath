package Important_Java_Topics;

import java.io.*;

/**
 * <P>
 *     Java IO Files
 *     File class to create a file.
 *     FileWriter class to write to a file, FileReader to read from a file.
 *     BufferedWriter to write to a file, BufferedReader to read from a file
 *
 * </P>
 */
public class IOFiles {

    public static void main(String[] args) throws IOException {
    f1();
    f2();
    f3();
    r1();
    r2();
}

    /**
     * <p>
     *     This method creates a file
     * <p>
     */

private static void f1() throws IOException {
    File f1=new File("C:\\Users\\sball\\Desktop\\IOSample\\mynewdir");
    f1.mkdir();
    File f=new File("C:\\Users\\sball\\Desktop\\IOSample\\t1.txt");
    System.out.println(f.exists());
    f.createNewFile();

}

    /**
     * <p>
     *     This method Creates file using FileWriter and
     *     Writes to file using FileWriter class write() method.
     * </p>
     */
    private static void f2() throws IOException {
    FileWriter fw=new FileWriter("C:\\Users\\sball\\Desktop\\IOSample\\t5.txt", true);
    fw.write(100 );
    fw.write("\n");
    char[] arr={'w','e'};
    fw.write(arr);
    fw.write("\n");
    String s="hello world";
    fw.write(s);
    fw.flush();  // is mandatory.
    fw.close();
}

    /**
     * <p>
     *  This method Creates file using FileWriter and
     *  Writes to file using BufferedWriter class write() method.
     * </p>
     */
    private static void f3() throws IOException {
    FileWriter f4=new FileWriter("C:\\Users\\sball\\Desktop\\IOSample\\t10.txt");
    BufferedWriter bw=new BufferedWriter(f4);
    bw.write('l');
    bw.write("\n");
    char[] arr={'w','e'};
    bw.write(arr);
    bw.write("\n");
    String s="hello world";
    bw.write(s);
    bw.flush();
    bw.close();
}

    /**
     * <p>
     *  This method reads from a file using FileReader read() method as characters.
     * </p>
     */
private static void r1() throws IOException {
    File f=new File("C:\\Users\\sball\\Desktop\\IOSample\\t10.txt");
    FileReader fr=new FileReader(f);
    char[] ch=new char[(int)f.length()];
    fr.read(ch);
    for(char ch1:ch) {
        System.out.print(ch1);
    }
    fr.close();
}
    /**
     * <p>
     *  This method locates a file using FileReader.
     *  reads from file BufferedReader readLine() method as Strings.
     * </p>
     */
private static void r2() throws IOException {
    FileReader fr=new FileReader("C:\\Users\\sball\\Desktop\\IOSample\\t10.txt");
    BufferedReader br= new BufferedReader(fr);
    String line=br.readLine();
    while(line != null) {
        System.out.println(line);
        line=br.readLine();
    }
    br.close();


}

}
