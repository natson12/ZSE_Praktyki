package second_week.arrays.zadania_6;

import java.util.Random;
public class zadanie4 {

    public static void main(String[] args) {

        Random jazda = new Random();
        String potrawa[] = {"Pizza ", "Lazania ", "Kanapki ", "Nic ", "Pierogi ", "Spaghetti "};
        int sniadanie = jazda.nextInt(potrawa.length);
        int obiad = jazda.nextInt(potrawa.length);
        int kolacja = jazda.nextInt(potrawa.length);
        System.out.println("Na śniadanie zjem: " + potrawa[sniadanie] + "\n Na obiad zjem: " + potrawa[obiad] + "\n Na kolacje zjem: " + potrawa[kolacja]);
    }
}
