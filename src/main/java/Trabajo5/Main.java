//suma de números positivos hasta que ingrese un número negativo
package Trabajo5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int suma = 0;

        System.out.println("Ingresa números positivos para sumarlos. Ingresa un número negativo para terminar.");

        while (numero >= 0) {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                suma += numero;
            }
        }

        System.out.println("La suma de los números positivos ingresados es: " + suma);
    }
}
