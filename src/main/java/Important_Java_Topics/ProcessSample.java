package Important_Java_Topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessSample {
    public static void main(String[] args) throws IOException {
    /**
    * To get standard output
    */
        //  String s= "ping www.google.com";
        String s = "ipconfig";

        Process p = Runtime.getRuntime().exec(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }



}
