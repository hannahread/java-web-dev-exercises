package studios.characterscount;

import org.launchcode.java.demos.lsn2controlflowandcollections.HashMapGradebook;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String movieQuote = "If the product of two terms is zero then common sense says at least one of the two" +
                " terms has to be zero to start with. So if you move all the terms over to one side, you can put " +
                "the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = movieQuote.toCharArray();
        count(charactersInString);
    }

    public static void count(char[] charactersInString ) {
        HashMap<Character, Integer> countChar = new HashMap<>();
        for (int i = 0; i < charactersInString.length ; i++) {
                int counter = 0;
                char searching = charactersInString[i];
            for (int j = 0; j < charactersInString.length ; j++) {
                if (charactersInString[j] == searching) {
                    counter++;
                }
            } countChar.put(searching, counter);
        }
        for (Map.Entry<Character, Integer> i : countChar.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }
}
