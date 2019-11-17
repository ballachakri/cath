package Java_Tech_Exercises;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.Arrays;

/**
 * <p>
 *     String Exercises
 *
 * </p>
 */
public class StringDemo {

    static String str = "balla srinivasa chakravarthy";

    public static void main(String[] args) {
        System.out.println("length() of given String : " + str.length());
        // Reverse of the String
        System.out.println(" using loop : "+revString());
        System.out.println(" using char[] and loop : "+revString1());
        System.out.println(" using StringBuffer : " +revString2());
        System.out.println(" using StringBuilder : " +revString3());
    }

    /**
     * Reverse of the String using for loop
     * @return
     */
    private static String revString() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    /**
     * Reverse of the String - by converting to char array and using for loop
     */
    private static String revString1()
    {
        char[] ch=str.toCharArray();
        String temp="";
        for(int i=ch.length-1;i>=0;i--)
        {
            temp=temp+ch[i];
        }
        return temp;
    }

    /**
     *  Reverse of String using StringBuffer
     */

    private static String revString2()
    {
        StringBuffer sb= new StringBuffer(str);
        String temp= String.valueOf(sb.reverse());
        return temp;

    }

    /**
     *  Reverse of String using StringBuilder
     */

    private static String revString3()
    {
        StringBuilder sb1= new StringBuilder(str);
        String temp= String.valueOf(sb1.reverse());
        return temp;

    }



}
