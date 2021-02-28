package first_week.statements.zadania_4;

import java.util.Scanner;

public class zadanie4 {

    //zadanie 4
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        int raz = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        int dwa = y.nextInt();
        Scanner z = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        int trzy = z.nextInt();

        if (raz < dwa && dwa < trzy) {
            System.out.println("Rosnąco");
        }
        else {

            if (trzy < dwa && dwa < raz) {
                System.out.println("Malejąco");
            }
            else {
                System.out.println("Losowo");
            }
        }
    }
}
