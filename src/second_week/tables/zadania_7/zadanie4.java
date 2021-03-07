package second_week.tables.zadania_7;

import java.util.Random;

public class zadanie4 {
    public static void main(String[] args) {


    Random random = new Random();
    int j,d;

    int[][] tablica1 = new int [2][2];
    int[][] tablica2 = new int [2][2];
    int[][] tablica3 = new int [2][2];

        for (j = 0; j <= 1; j++){
        for (d = 0; d <=1; d++){
            tablica1[j][d] = random.nextInt(10000);
        }
    }
        for (j = 0; j <= 1; j++){
        for (d = 0; d <=1; d++){
            tablica2[j][d] = random.nextInt(10000);
        }
    }
        for (j = 0; j <= 1; j++){
        for (d = 0; d <=1; d++){
            tablica3[j][d] = tablica1[j][d] + tablica2[j][d];
        }
    }


        for (j = 0; j <= 1; j++){
        for (d = 0; d <=1; d++){
            System.out.print("[" + tablica1[j][d] + "] \t");
        }
        System.out.println();
    }

        for (j = 0; j <= 1; j++){
        for (d = 0; d<=1; d++){
            System.out.print("[" + tablica2[j][d] + "] \t");
        }
        System.out.println();
    }

        for (j = 0; j <= 1; j++){
        for (d = 0; d <=1; d++){
            System.out.print("[" + tablica1[j][d] + "] + [" + tablica2[j][d] + "] = [" + tablica3[j][d] + "] \t");
        }
        System.out.println();
    }

    }
}
