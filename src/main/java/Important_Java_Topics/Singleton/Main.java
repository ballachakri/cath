package Important_Java_Topics.Singleton;

public class Main {

    public static void main(String[] args) {
        SingleTonSample ss;

        // referring only object of SingleTonSample

        ss = SingleTonSample.getInstance();
        ss.getConnection();
    }
}
