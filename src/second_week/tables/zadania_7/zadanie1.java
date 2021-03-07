package second_week.tables.zadania_7;

public class zadanie1 {

    public static void main(String[] args) {

        int[][] tab = new int[5][5];

        int value = 0 , j;

        for (int i = 0; i <=4; i++){
            for (j = 0; j <= 4; j++){
                tab[i][j] = value;
                value += 5;
            }
        }
        for (int i = 0; i <=4; i++){
            for (j = 0; j <= 4; j++){
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
