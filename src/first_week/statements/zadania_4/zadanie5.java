package first_week.statements.zadania_4;

import java.util.Scanner;

public class zadanie5 {

    //zadanie 5
    public static void main(String[] args) {
        Scanner l1 = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        double x = l1.nextInt();
        Scanner l2 = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        double y = l2.nextInt();
        Scanner dzialanie = new Scanner(System.in);
        System.out.println("Wybierz działanie (+,-,*,/): ");

        char wybor = dzialanie.next().charAt(0);

        switch (wybor) {
            case '+':
                double suma = x + y;
                System.out.println("Wynik dodawania: "+ suma);
                break;

            case '-':
                double roznica = x - y;
                System.out.println("Wynik odejmowania: "+ roznica);
                break;

            case '*':
                double iloczyn = x * y;
                System.out.println("Wynik mnożenia: "+ iloczyn);
                break;

            case '/':
                double iloraz = x / y;
                System.out.println("Wynik dzielenia: "+ iloraz);
                break;

            default:
                System.out.println("Nie wybrano żadnego działania.");
                break;

        }
    }
}
