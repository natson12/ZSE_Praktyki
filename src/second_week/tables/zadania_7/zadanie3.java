package second_week.tables.zadania_7;

public class zadanie3 {

    public static void main(String[] args) {

        int value = 0, m, n;
        int  k, j;

        int[][][][][] tab2 = new int [2][2][2][2][2];

        for (int i = 0; i <=1; i++){
            for (j = 0; j <= 1; j++){
                for (m = 0; m <=1; m++){
                    for (n = 0; n <= 1; n++){
                        for (k =0; k <= 1; k++){
                            tab2[i][j][m][n][k] = value;
                            value++;
                        }
                    }
                }
            }
        }

        for (int i = 0; i <= 1; i++){
            for (j = 0; j <= 1; j++){
                for (m = 0; m <=1; m++){
                    for (n = 0; n <= 1; n++){
                        for (k =0; k <= 1; k++){
                            System.out.print("[" + i + "][" + j + "][" + m + "][" + n + "][" + k + "] = " +  tab2[i][j][m][n][k] + " \t");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
