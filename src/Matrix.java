import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        // Moje rozwiązanie

/*        int x, y, licz;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą z przedziału od 1 do 30");
        int liczba = scanner.nextInt();
        System.out.println("n = " + liczba + " Matrix");
        System.out.println("- - - - - - -");

        licz = 0;
        if (liczba > 30) {
            System.out.println("Błędny zakres");
        } else {

            for (x = 1; x <= liczba; x++) {
                if (x < 10) {
                    System.out.print("  " + x);
                } else {
                    System.out.print(" " + x);
                }
                for (y = (x + 1); y <= 100; y++) {
                    if (y < 10) {
                        System.out.print("  " + y);
                    } else {
                        System.out.print(" " + y);
                    }
                    licz++;
                    if (licz == liczba) {
                        System.out.println();
                        licz = 0;
                        break;
                    }
                }
            }
        }*/

        int n = 15;

        System.out.println("n = " + n + " Matrix");
        System.out.println("----------");

        for (int i = 0; i < n ; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3s", j + i + " ");
            }
            System.out.println();

        }



    }
}
