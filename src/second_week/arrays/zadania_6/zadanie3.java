package second_week.arrays.zadania_6;

import java.util.Random;

public class zadanie3 {


    public static void main(String[] args) {

        Random jazda = new Random();

        String pies[] = {"Edward", "Gustaw", "Janusz"};
        int select = jazda.nextInt(pies.length);
        System.out.println("Wylosowane imię dla psa: " + pies[select]);


        }
}