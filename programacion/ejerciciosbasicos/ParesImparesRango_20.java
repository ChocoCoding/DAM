package ciclo.DAM.primera.evaluacion.programacion.ejerciciosbasicos;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 24/10/2022
 * // Introducir 2 números por teclado. Imprimir los números que hay entre ambos,
 * // contar cuántos hay y cuántos son pares.
 * // Calcular el producto de los impares
 */
public class ParesImparesRango_20 {
    public static void main(String[] args) {
        calcularParesImparesRango();
    }

    private static void calcularParesImparesRango() {
        Scanner sc = new Scanner(System.in);
        int num1, num2,contNum,contPares,prodImpares;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        contNum = 0;
        contPares = 0;
        prodImpares = 1;
        if (num1 < num2){
        num1 = num1 + 1;
        num2 = num2 - 1;

        for (int i = num1; i <= num2; i++){
            contNum += 1;
            if (i % 2 == 0){
                contPares+=1;
            } else if (i % 2 != 0) {
                prodImpares *= i;
            }
            System.out.println(i);
        }
        System.out.println("Hay un total de " + contNum + " numeros entre medias");
        System.out.println("Hay un total de " + contPares + " numeros Pares");
        System.out.println("El producto de los impares es: " + prodImpares);
    }else {

            num1 = num1 - 1;
            num2 = num2 + 1;
            contNum = 0;
            contPares = 0;
            prodImpares = 1;
            if (num1 > num2){
                for (int i = num2; i <= num1; i++){
                    contNum += 1;
                    if (i % 2 == 0){
                        contPares+=1;
                    } else if (i % 2 != 0) {
                        prodImpares *= i;
                    }
                    System.out.println(i);
                }
                System.out.println("Hay un total de " + contNum + " numeros entre medias");
                System.out.println("Hay un total de " + contPares + " numeros Pares");
                System.out.println("El producto de los impares es: " + prodImpares);
        }
    }
}
}
