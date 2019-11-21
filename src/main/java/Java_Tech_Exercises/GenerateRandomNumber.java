package Java_Tech_Exercises;

import java.util.Random;

public class GenerateRandomNumber {
    /**
     * <p>
     * This method generates returns random number for a given upper limit integer value as a argument.
     * If generated number is equal to 0, then it will add 1 and returns 1 as random number.
     *  </p>
     * @param upperLimit
     * @return
     */
    public static int getRandomNumber(final int upperLimit) {

        Random random = new Random();
        int randomNumber = random.nextInt(upperLimit);
        if (randomNumber == 0) {
            randomNumber = randomNumber + 1;
        }
        return randomNumber;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(getRandomNumber(30));
        }

    }


}
