package org.launchcode.java.studios;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class countingChar {
    public static void main(String[] args) {
        String myStory;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your string:");

        HashMap<String, Integer> letterCounter = new HashMap<>();

        myStory = in.nextLine();

        myStory = myStory.replaceAll("\\P{Alnum}", "").toLowerCase();

        List<String> myList = new ArrayList<String>(Arrays.asList(myStory.split("")));

        for (String letter : myList) {
            letter = letter.toLowerCase();
            if (letterCounter.containsKey(letter)) {

                letterCounter.put(letter, letterCounter.get(letter) + 1);
            } else {
                letterCounter.put(letter, 1);
            }

        }
        for (Map.Entry<String, Integer> letter : letterCounter.entrySet()) {
            System.out.println(letter.getKey() + " = " + letter.getValue());
        }
    }
}
