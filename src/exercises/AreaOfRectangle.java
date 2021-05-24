package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        double length;
        double width;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of your rectangle in inches: ");
        length = input.nextDouble();

        System.out.println("Enter the width of your rectangle in inches: ");
        width = input.nextDouble();

        area = length * width;
        System.out.println("The area of your rectangle is: " + area + " square inches");
    }
}
