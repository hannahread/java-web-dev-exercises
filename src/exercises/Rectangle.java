package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        int length;
        int width;
        int area;

        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle: ");
        length = input.nextInt();
        System.out.println("What is the width of the rectangle: ");
        width = input.nextInt();
        area = (length * width);
        System.out.println("The area of the rectangle is: " + area);
    }
}
