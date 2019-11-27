package Important_Java_Topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] arr={"hello","world"};

        // using Arrays,asList()
        ArrayList<String> al=new ArrayList(Arrays.asList(arr));

        // using Collections.addAll()
        Collections.addAll(al,arr);
        for(String s:al) {
            System.out.println(s);
        }


    }
}
