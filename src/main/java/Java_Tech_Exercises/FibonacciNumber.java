package Java_Tech_Exercises;

/**
 * <p>
 *     Fibonacci Number
 *     1,2,3,5,7,13
 * </p>
 */
public class FibonacciNumber {

    public static void main(String[] args) {

        System.out.println(fib(5));
    }

    private static long fib(int num) {
        int num1=0,num2=1;
        int fib=0;
        for(int i=1;i<=num;i++) {
         fib=num1+num2;
         num1=num2;
         num2=fib;
        }
        return fib;
    }
}
