package ciclo.DAM.primera.evaluacion.programacion.ejerciciosbasicos;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 24/10/2022
 * // Algoritmo que imprima el mayor y el menor número de una
 * serie de números introducidos por teclado(-1 para salir)
 */
public class MayorMenorSerie_19 {
    public static void main(String[] args) {
        calcularMayorMenor();
    }

    private static void calcularMayorMenor() {
        int num,numMayor,numMenor;
        Scanner sc = new Scanner(System.in);
        numMayor = 0;
        numMenor = Integer.MAX_VALUE;
        do {
            System.out.println("Introduce un numero, (-1 para salir del programa)");
            num = sc.nextInt();
            if(num > numMayor && num != -1) {
                numMayor = num;
            } else if (num < numMenor && num != -1) {
                numMenor = num;
            }

        }while(num != -1);

        System.out.println("El numero mayor es: " + numMayor);
        System.out.println("El numero menor es: " + numMenor);
    }
}
