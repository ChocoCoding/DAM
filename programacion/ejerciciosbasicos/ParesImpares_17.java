package ciclo.DAM.primera.evaluacion.programacion.ejerciciosbasicos;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 24/10/2022
 * // Dados 10 números enteros que se ingresan por teclado,
 * // calcular cuántos de ellos son pares, cuánto suman los pares,
 * // el promedio de los impares y la suma total
 */
public class ParesImpares_17 {
    public static void main(String[] args) {
    calcularNumeros();

    }

    private static void calcularNumeros() {
        Scanner sc = new Scanner(System.in);
        int num, contPares, contImpares, sumaPares, sumaImpares;
        contPares = 0;
        contImpares = 0;
        sumaPares = 0;
        sumaImpares = 0;
        for(int i = 1; i <= 10;i++){
            System.out.println("Escribe un numero");
            num = sc.nextInt();
            if (num % 2 == 0){
                contPares += 1;
                sumaPares += num;

            }else {
                contImpares +=1;
                sumaImpares += num;
            }
        }
        System.out.println("El numero de pares es: " + contPares + "\nLa suma es: " + sumaPares);
        System.out.println("El numero de Impares es: " + contImpares + "\nLa suma es: " + sumaImpares);

    }
}
