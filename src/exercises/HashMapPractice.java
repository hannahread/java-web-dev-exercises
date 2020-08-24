package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);

        String name;
        Integer id;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.println("Enter a students name: ");
            name = input.nextLine();

                if (!name.equals("")) {
                    System.out.println("Enter their ID number: ");
                    id = input.nextInt();
                    students.put(id, name);

                    input.nextLine();
                }

        } while (!name.equals(""));

        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}
