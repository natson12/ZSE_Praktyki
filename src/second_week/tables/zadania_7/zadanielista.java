package second_week.tables.zadania_7;

import java.util.Collections;

import java.util.ArrayList;

public class zadanielista {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        System.out.println("Lista po stworzeniu: " + lista);

        lista.add("Roblox");

        lista.add("Brawl Stars");
        System.out.println("Lista po dodaniu zwykłym: " + lista);

        lista.add(1,"Minecraft");
        System.out.println("Lista po dodaniu na indeks: " + lista);

        lista.remove("Fortnite");
        System.out.println("Lista po usunięciu po nazwie: " + lista);

        lista.remove(0);
        System.out.println("Lista po usunięciu po indeksu: " + lista);

        lista.set(0,"Battlefield 5");
        System.out.println("Lista po nadpisywaniu: " + lista);


        Collections.sort(lista);
        System.out.println("Lista po sortowaniu: " + lista);

        lista.clear();
        System.out.println("Lista po czyszczeniu: " + lista);
    }

}


