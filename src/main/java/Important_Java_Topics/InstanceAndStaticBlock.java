package Important_Java_Topics;

import java.time.LocalDateTime;

public class InstanceAndStaticBlock {
    /**
     * static block will execute only once, when class is loaded into memory
     */
    static
    {
        System.out.println("i am static block");
    }

    /**
     * instance block will execute whenever the object is created.
     */
    {
        System.out.println("i am instance block");
    }

    /**
     * Constructor is called whenever the object is created.
     */
    InstanceAndStaticBlock()
    {
        System.out.println("i am constructor");
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("Local Date Time : "+ldt);


    }

    public static void main(String[] args) {

     InstanceAndStaticBlock obj=new InstanceAndStaticBlock();
        System.out.println("first object obj is created");
     InstanceAndStaticBlock obj1=new InstanceAndStaticBlock();
        System.out.println("second object obj1 is created");

        System.out.println("System Environment : "+System.getenv());
        System.out.println("System nanoT ime : "+System.nanoTime());
        System.gc();

        System.out.println("System properties : "+System.getProperties());

    }
}
