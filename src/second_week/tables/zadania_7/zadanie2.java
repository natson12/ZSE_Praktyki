package second_week.tables.zadania_7;

public class zadanie2 {

    public static void main(String[] args) {

        int value =0, e;
        int q, w;


        int[][][][] tab1 = new int [3][3][3][3];

        for (int i = 0; i <=2; i++){
            for (e = 0; e <= 2; e++){
                for (w = 0; w <=2; w++){
                    for (q = 0; q <= 2; q++){
                        tab1[i][e][w][q] = value;
                        value++;
                    }
                }
            }
        }

        for (int i = 0; i <= 2; i++){
            for (e = 0; e <= 2; e++){
                for (w = 0; w <=2; w++){
                    for (q = 0; q <= 2; q++){
                        System.out.print("[" + i + "][" + e + "][" + w + "][" + q + "] = " +  tab1[i][e][w][q] + " \t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
