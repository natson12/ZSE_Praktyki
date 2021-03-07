package second_week.arrays.zadania_6;

import java.util.Arrays;

import java.util.Collections;

public class zadanie5 {

    public static void main(String[] args) {

        String tab2[] = {"ram", "pam", "fsiubśdziu", "siup", "fiup", "skrt", "bum", "aaaa", "brzt", "wraaaa", "firabira", "fikumiku", "woooooo", "blueface baby", "yeah aight", "skraaaaaaaaa", "boom boom", "sikalafą", "szakarą makarą", "digidigidą"};
        System.out.print("Tablica: [");
        for(int i = 0; i < tab2.length ; i++){
            if (i == tab2.length - 1){
                System.out.print(tab2[i] + "]");
            }
            else {
                System.out.print(tab2[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Posortowano");
        Arrays.sort(tab2,0,10);
        Arrays.sort(tab2,10,tab2.length, Collections.reverseOrder());
        System.out.print("Tablica: [");
        for(int i = 0; i < tab2.length ; i++){
            if (i == tab2.length - 1){
                System.out.print(tab2[i] + "]");
            }
            else {
                System.out.print(tab2[i] + ", ");
            }
        }

    }
}
