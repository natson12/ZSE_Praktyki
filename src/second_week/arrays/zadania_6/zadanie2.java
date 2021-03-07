package second_week.arrays.zadania_6;

import java.util.Arrays;

import java.util.Collections;

public class zadanie2 {

    public static void main(String[] args) {

        String[] stringArray = {"jazda", "zenek", "DisStream", "moi", "rodzice", "to", "komuniści", ",", "kocham", "prezydenta", "Dude", "i", "Morawieckiego"};

        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Sortowanie malejąco: " + Arrays.toString(stringArray));
    }
}
