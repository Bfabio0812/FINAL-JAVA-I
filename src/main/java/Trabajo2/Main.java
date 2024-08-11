//encontrar el mayor de 3 números

package Trabajo2;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame tres numeros");

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        if(numero1 > numero2 && numero1> numero3){
            System.out.println("El primer número es mayor");
        }else if(numero2>numero1 && numero2 > numero3) {
            System.out.println("El segundo número es mayor");
        } else if(numero3 > numero1 && numero3 > numero2){
            System.out.println("el tercer número es mal");
        } else{
            System.out.println("no hay números");
        }
    }
}
