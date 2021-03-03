package second_week.loops.zadania_5;

public class zadanie3 {

    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) {
            for(int b = 1; b <= 10; b++) {
                int c = a*b;
                if (c % 2 == 0) {
                    System.out.println(+c);
                }
                    else{
                    System.out.println("X");
                }
            }
        }
    }
}
