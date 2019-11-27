package Important_Java_Topics;

import org.openqa.selenium.support.PageFactory;

import java.util.*;

public class Iterator_ListIterator {

    public static void main(String[] args) {

        // Iterator
        List<String> l=new ArrayList<String>();
        l.add("ram");
        l.add("shaam");
        l.add("john");
       Iterator itr=l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // listIterator -- hasNext()
        ListIterator litr=l.listIterator();
        while (litr.hasNext())
        {
            System.out.println(litr.next());
        }

        //ListIterator -- hasPrevious()
        while (litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }


    }
}
