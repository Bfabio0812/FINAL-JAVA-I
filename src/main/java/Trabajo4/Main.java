//adivina un número del 1 al 5;
package Trabajo4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("ingresa un número del 1 al 5");

        int numero;


        do{
            System.out.println("ingresa un número del 1 al 5");
            numero = scanner.nextInt();

        }while ( numero != 5);
        System.out.println("el proceso finalizó con éxito");


    }
}
