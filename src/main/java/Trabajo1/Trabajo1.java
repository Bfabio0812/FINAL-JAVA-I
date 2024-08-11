//pedir el nombre de estudiantes y dar el promedio

package Trabajo1;

import java.util.Scanner;

public class Trabajo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();
        scanner.nextLine();

        String[] nombres = new String[numEstudiantes];
        double[] calificaciones = new double[numEstudiantes];
        double sumaCalificaciones = 0;

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese la calificación de " + nombres[i] + ": ");
            calificaciones[i] = scanner.nextDouble();
            scanner.nextLine();

            sumaCalificaciones += calificaciones[i];
        }

        double promedio = sumaCalificaciones / numEstudiantes;

        System.out.println("\nEl promedio de calificaciones es: " + promedio);
    }
}