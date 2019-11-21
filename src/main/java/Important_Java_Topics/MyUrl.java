package Important_Java_Topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;

public class MyUrl {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.cathkidston.com/");
        System.out.println("Host   : " + url.getHost());
        System.out.println("Port number   : " + url.getPort());
        System.out.println("Path  : "+url.getPath());
        System.out.println("Protocol  : " + url.getProtocol());
        System.out.println("Open Connection : + " + url.openConnection());


        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setConnectTimeout(2000);
        con.connect();
        System.out.println("Response code : "+ con.getResponseCode());
        System.out.println("Request Method : " +con.getRequestMethod());
        con.disconnect();
    }

}
