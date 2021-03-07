package second_week.arrays.zadania_6;

import java.util.Arrays;

public class zadanie1 {

    public static void main(String[] args) {

        char [] tablica = {'x', 't', 'a', 'g', 'q', 'l', 'm', 'd', 'w', 'b', 'j', 'w', 'e', 'c', 'v', 'f', 'p', 'r', 'y', 'i'};

        Arrays.sort(tablica);
        System.out.println("Sortowanie rosnąco: " + Arrays.toString(tablica));

    }
}
