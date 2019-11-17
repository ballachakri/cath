package Java_Tech_Exercises;

/**
 * <p>
 *     Factorial Number
 *     5! = 5*4*3*2*1 = 125
 * </p>
 */
public class FactorialNumber {

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }

    public static long factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

}
