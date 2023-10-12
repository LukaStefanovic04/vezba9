import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvi broj ");
        double a = scanner.nextDouble();
        System.out.println("Unesite drugi broj ");
        double b = scanner.nextDouble();;
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.add(a,b);
        kalkulator.mul(a,b);
        kalkulator.sub(a,b);
        kalkulator.div(a,b);


    }
}