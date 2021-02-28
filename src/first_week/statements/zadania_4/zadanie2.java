package first_week.statements.zadania_4;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {

        //zadanie 2
        System.out.println("Podaj pierwszą liczbę: ");
        Scanner skaner = new Scanner(System.in);
        int a = skaner.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        int b = skaner.nextInt();

        System.out.println("Podaj trzecią liczbę: ");
        int c = skaner.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println("Największa liczba to: " + a);
        }

            else if((b > a) && (b > c)) {
            System.out.println("Największa liczba to: " + b);
        }
            else{
            System.out.println("Największa liczba to: " + c);
        }
    }
}
