import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Convertidor de grados Celsius a Fahrenheit");
        System.out.println("Ingrese Grados Celsius:");
        int Celsius = Integer.parseInt(inputInt.next());
        double Fahrenheit = (int) ((Celsius *1.8) + 32);
        System.out.println(Celsius + " celsius es igual a " + Fahrenheit + " Fahrenheit");
    }
}