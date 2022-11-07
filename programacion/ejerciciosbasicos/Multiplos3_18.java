package ciclo.DAM.primera.evaluacion.programacion.ejerciciosbasicos;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 24/10/2022
 * //Imprimir y contar los números múltiplos de 3 desde 1 hasta un número que introduzcamos por teclado
 */
public class Multiplos3_18 {
    public static void main(String[] args) {
    contarMultiplos();
    }

    private static void contarMultiplos() {
        Scanner sc = new Scanner(System.in);
        int num, contNum;
        contNum = 0;
        System.out.println("Escribe un numero");
        num = sc.nextInt();
        for (int i = 1;i <= num;i ++) {
        if (i % 3 == 0) {
            contNum += 1;
            System.out.println("Multiplo de 3: " + i);
        }
        }
        System.out.println("El numero de multiplos es: " + contNum);
    }

}
