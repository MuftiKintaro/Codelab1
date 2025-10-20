package Modul1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};
        ArrayList<String> longestNames = findLongestName(names);
        System.out.println("The longest name(s): " + longestNames);
    }

    public static ArrayList<String> findLongestName(String[] array) {
        ArrayList<String> result = new ArrayList<>();

        if (array.length == 0) {
            return result;
        }

        String maxName = array[0];
        for (String name : array) {
            if (name.length() > maxName.length()) {
                maxName = name;
            }
        }

        for (String name : array) {
            if (name.length() == maxName.length()) {
                result.add(name);
            }
        }

        return result;
    }
}
