package Assignment_1;

import java.util.*;

public class RandomNumbers {

    static Random random;

    private RandomNumbers() {
        random = new Random();
    }

    public static int getRandomInt() {
        if(random == null) new RandomNumbers();
        return random.nextInt();
    }

    public static int getRandomInt(int lower, int upper) {
        if(lower > upper) return 0;
        if(lower == upper) return lower;
        int difference = upper - lower;
        int start = getRandomInt();
        start = Math.abs(start) % (difference+1);

        start += lower;
        return start;
    }

    public static void main(String[] args){
        int randomNumber = getRandomInt(0, 2000000000);
        if (randomNumber <= Byte.MAX_VALUE) {
            System.out.println(randomNumber + " the preferred data type is byte.");
        } else if (randomNumber <= Short.MAX_VALUE) {
            System.out.println(randomNumber + " the preferred data type is short.");
        } else {
            System.out.println(randomNumber + " the preferred data type is integer.");
        }
    }


}