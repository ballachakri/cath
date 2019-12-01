package Important_Java_Topics.Singleton;

/**
 * Singleton is a design pattern, it ensures that only one instance of a class is created.
 * means restricting the object creation more than once.
 * Steps:
 * creating a private constructor that restricts to create object outside of a lcass
 * creating a private attribute that refers to singleton object.
 * creating a public static method that allows to create and access object that is created inside the method.
 */
public class SingleTonSample {

    private static SingleTonSample singleTonObject;

    private SingleTonSample() {

    }
    public static SingleTonSample getInstance(){
        if (singleTonObject==null) {
            singleTonObject=new SingleTonSample();
        }
        return singleTonObject;
    }

    public void getConnection(){
        System.out.println("Database connection established............:");
    }

}
