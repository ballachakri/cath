package Java_Tech_Exercises;

/**
 * <p>
 * Reverse of a number
 * </p>
 */
public class ReverseOfNumber {
    public static void main(String[] args) {
        rev1();
        rev2();
    }

    private static void rev1() {
        long num = 356459;
        long rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("reverse of a number : "  + rev);
    }

    private static void rev2()
    {
        long num=5164892;
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();
        System.out.println("reverse of a number : "  + rev);
    }
}


