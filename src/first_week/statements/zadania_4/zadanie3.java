package first_week.statements.zadania_4;

import java.util.Scanner;

public class zadanie3 {

    //zadanie3
    public static void main(String[] args) {

        Scanner login = new Scanner(System.in);
        System.out.println("Podaj swój login: ");
        String log = login.next();

        Scanner haslo = new Scanner(System.in);
        System.out.println("Podaj swoje haslo: ");
        String has = haslo.next();


        if (log.equals("Badman420") && has.equals("qwerty123")){
            System.out.println("Zalogowano pomyślnie");
        }
        else {
            System.out.println("Logowanie nie powiodło się");
        }
    }
}
