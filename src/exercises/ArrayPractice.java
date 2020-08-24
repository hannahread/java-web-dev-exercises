package exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 8};
        printNums(array);
        String drSuess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        stringToArray(drSuess);
    }

        public static void printNums(int[] array) {

            for (int item : array) {
                if (!(item % 2 == 0))
                    System.out.println(item);
            }
        }

        public static void stringToArray(String drSuess) {
            String[] drSuessArray = drSuess.split(" ");
            System.out.println(Arrays.toString(drSuessArray));
            String[] sentenceArray = drSuess.split("\\.");
            System.out.println(Arrays.toString(sentenceArray));
        }
    }


