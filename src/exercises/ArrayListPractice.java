package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
    ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        randomNumbers.add(2);
        randomNumbers.add(14);
        randomNumbers.add(5);
        randomNumbers.add(7);
        randomNumbers.add(13);
        randomNumbers.add(18);
        randomNumbers.add(6);
        randomNumbers.add(8);
        randomNumbers.add(1);
        randomNumbers.add(4);
        randomNumbers.add(12);

    sumEven(randomNumbers);

    ArrayList<String> fiveLetterWords = new ArrayList<>();
        fiveLetterWords.add("tiger");
        fiveLetterWords.add("kitty");
        fiveLetterWords.add("alien");
        fiveLetterWords.add("money");

    String drSuess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

    printWords(drSuess);


    }

    public static void sumEven(ArrayList<Integer> randomNumbers) {
        Integer sum = 0;
        for (Integer item : randomNumbers) {
            if (item % 2 == 0) {
                sum += item;
            }
        }
        System.out.println(sum);
    }

    public static void printWords(String drSuess) {
        //get input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the word length: ");
        double wordLength = input.nextDouble();

        //create a new string with the punctuation removed from drSuess.
        String newDrSuess = drSuess.replace(",", "");
        String finalDrSuess = newDrSuess.replace(".", "");

        //create the list of words in the string
        String suess[] = finalDrSuess.split(" ");
        List<String> suessList = new ArrayList<String>();
        suessList = Arrays.asList(suess);

        //loop through the string and print all of the words based on the word length input from the user.
        for (String item : suessList) {
            if (item.length() == wordLength) {
                System.out.println(item);
            }
        }
    }
}


