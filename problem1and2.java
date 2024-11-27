package Assignment_1;

--sample new text here--
public class problem1and2 {
    public static void main(String[] args) {
        String emojieWavingHand = "\uD83D\uDC4B";

        /*Since my name is in English, I have used different characters to spell it
        as per in the instructions.*/

        String myName = "\"\u0410\u043B\u0435\u043A\u0441\u0430\u043D\u0434\u0440\"";

        String wholeSentence = "Hi" + " " + emojieWavingHand + ", " + "my name is" + " " + myName + ".";

        System.out.println(wholeSentence);

        System.out.println("The size of the string is: " + wholeSentence.length());
        /*The size of wholeSentence string variable is 30, because the whole variable
        is separated by each own code units or characters including the escape characters of
        double quotes and concatenation space.
         */
    }
}
