//calculadora simple, crea una calculadora simple que realice operaciones básicas
//como suma, resta, multiplicación y división. puedes solicitar al usuario quei ngreso dos números y la operación que desea realizar
package Trabajo3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Ingrese el tipo de operación que desea realizar (suma, resta, multiplicación, división):");
        String operacion = scanner.next();

        double resultado;

        switch (operacion.toLowerCase()) {
            case "suma":
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case "resta":
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case "multiplicación":
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case "división":
                try {
                    if (numero2 == 0) {
                        throw new ArithmeticException("Error: No se puede dividir por cero.");
                    }
                    resultado = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Operación no válida. Por favor, ingrese suma, resta, multiplicación o división.");
        }
    }
}
