//Pedir al usuario la tabla de un número y que se la imprima

package Trabajo6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] numeros ={1,2,3,4,5,6,7,8,9,10};


        System.out.println("dame un número");

        Scanner scanner = new Scanner(System.in);

        int suma = scanner.nextInt();
        int resultado;

        for (int i=1; i <= numeros.length; i++ ){
            resultado = suma * numeros[i];
            System.out.println(resultado);

        }

    }
}