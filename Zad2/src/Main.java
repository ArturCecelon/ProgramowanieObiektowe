import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rownanie();
        Funkcja();
        Porzadkowanie();
        Kalkulator();

    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }


    public static void Rownanie() {
        System.out.println("Podaj a: ");
        int a = getInt();
        System.out.println("Podaj b: ");
        int b = getInt();
        System.out.println("Podaj c: ");
        int c = getInt();
        System.out.println("Obliczam delte: ");
        System.out.println("b^2-4*a*c = " + ((b * b) - (4 * a * c)));
        int delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            System.out.println("x1 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
            System.out.println("x2 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
        } else if (delta == 0) {
            System.out.println("x = " + ((-b) / (2 * a)));
        } else {
            System.out.println("To równanie niema rozwiązań");
        }
    }

    public static void Funkcja() {
    }

    public static void Porzadkowanie() {
        System.out.println("Podaj x: ");
        int x = getInt();
        System.out.println("Podaj y: ");
        int y = getInt();
        System.out.println("Podaj z: ");
        int z = getInt();
        System.out.println("Oto uporządkowany ciąg:");
        if (x > y && x > z && y > z) {
            System.out.println(z + ", " + y + ", " + x);
        } else if (x > y && x > z && z > y) {
            System.out.println(y + ", " + z + ", " + x);
        } else if (y > x && y > z && x > z) {
            System.out.println(z + ", " + x + ", " + y);
        } else if (y > x && y > z && z > x) {
            System.out.println(x + ", " + z + ", " + y);
        } else if (z > x && z > y && x > y) {
            System.out.println(y + ", " + x + ", " + z);
        } else {
            System.out.println(x + ", " + y + ", " + z);
        }

    }

    public static void Kalkulator() {
        System.out.println("........:::::KALKULATOR:::::........");
        System.out.println("1. Dodawnaie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Reszta z dzielenia");
        System.out.println();
        System.out.println("WYBIERZ CO CHCESZ ZROBIĆ ");
        int a = getInt();
        System.out.println("Podaj pierwszą liczbę: ");
        int x = getInt();
        System.out.println("Podaj drugą liczbę: ");
        int y = getInt();

        switch (a) {
            case 1:
                System.out.println(x + " + " + y + " = " + (x + y));
                break;
            case 2:
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case 3:
                System.out.println(x + " * " + y + " = " + (x * y));
                break;
            case 4:
                if (y == 0) {
                    System.out.println(" ,, Pamiętaj cholero nie dziel przez zero :) '' ");
                    break;
                } else {
                    System.out.println(x + " / " + y + " = " + (x / y));
                    break;
                }
            case 5:
                System.out.println("Reszta z dzielenia " + x + " / " + y + " = " + (x % y));
                break;
        }

    }
}