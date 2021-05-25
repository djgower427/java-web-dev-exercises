package exercises.chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] arg) {
        ArrayList<Integer> integerArray = new ArrayList<>();
        integerArray.add(0);
        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(3);
        integerArray.add(4);
        integerArray.add(5);
        integerArray.add(6);
        integerArray.add(7);
        integerArray.add(8);
        integerArray.add(9);

        System.out.println("ArrayList: " + integerArray);
        System.out.print(sumEven(integerArray));

        ArrayList <String> words = new ArrayList<>();
        words.add("high");
        words.add("Midge");
        words.add("Jessica");
        words.add("dog");
        words.add("cat");
        words.add("horse");
        words.add("cow");
        words.add("chicken");
        words.add("fish");
        words.add("pig");

        System.out.println("Words: " + words);
        wordsByLength(words);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0){
                total += integer;
            }
        }
        return total;
    }

    public static void wordsByLength(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for (String word : arr){
            if (word.length() == numChars){
                System.out.println(word);
            }
        }
    }
}
