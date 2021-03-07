package second_week.MethodsAndObjects;

import java.util.Scanner;

public class zadanie {



    interface piecPiekacz{
        void CiastkazTHC();
        void Bulka();
    }

    interface piecGrill{
        void grilowanie();
    }

    public class Zadanie implements piecGrill, piecPiekacz{

        private String zarcie;
        private int temperatura;
        private int czas;

        @Override
        public void CiastkazTHC() {
            zarcie = "Piecznie ciastek z THC";
            temperatura = 420;
            czas = 42;
            wlaczPiec();
        }

        @Override
        public void Bulka() {
            zarcie = "Pieczenie bułki";
            temperatura = 180;
            czas = 60;
            wlaczPiec();
        }

        @Override
        public void grilowanie () {
            zarcie = "Grillowanie steka";
            temperatura = 300;
            czas = 15;
            wlaczPiec();
        }

        private void wlaczPiec() {
            System.out.println("Rozpoczęto " + zarcie + " przy temperaturze: " + temperatura + " stopni, które potrwa: " + czas + " minut.");
        }

        public static void main(String[] args) {
            Zadanie piec = new Zadanie();

            piecPiekacz piekacz = piec;
            piecGrill gril = piec;

            Scanner skaner = new Scanner(System.in);

            System.out.println("1. Pieczenie ciastek z THC \n 2. Pieczenie Bułki \n 3. Grilowanie steka");
            System.out.print("Podaj co ma zrobić piec: ");
            int i = skaner.nextInt();

            switch (i){
                case 1:
                    piekacz.CiastkazTHC();
                    break;
                case 2:
                    piekacz.Bulka();
                    break;
                case 3:
                    gril.grilowanie();
                    break;
                default:
                    System.out.println("Bledny punkt");
                    break;
            }
        }
    }
}
