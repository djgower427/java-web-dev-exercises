package exercises;

import  java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        double milesDriven = input.nextDouble();

        System.out.println("How much gas have you consumed (in gallons)? ");
        double gasUsed = input.nextDouble();

        double milesPerGallon = milesDriven / gasUsed;
        System.out.println("You are currently returning " + milesPerGallon + " miles per gallon.");
    }
}
