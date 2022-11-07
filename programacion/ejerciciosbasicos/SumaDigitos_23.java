package ciclo.DAM.primera.evaluacion.programacion.ejerciciosbasicos;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 25/10/2022
 */
public class SumaDigitos_23 {

    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(sumarDigitos(num));
    }

    private static int sumarDigitos(int numero) {
        int suma;
        suma = 0;

        while (numero != 0){
            suma = suma + numero % 10; // 2
            numero /= 10; // 1
        }

        return suma;
    }

}