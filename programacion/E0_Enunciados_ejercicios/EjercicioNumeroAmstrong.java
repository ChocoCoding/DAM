package ciclo.DAM.primera.evaluacion.programacion.E0_Enunciados_ejercicios;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 25/10/2022
 */
public class EjercicioNumeroAmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calcularAmstrong(sc.nextInt()));


    }

    private static double calcularAmstrong(int numero) {
        double suma = 0;

        while(numero !=0){
            suma += numero % 10; //12
            suma = Math.pow(suma,3);
            numero /= 10;
        }
        return suma;
    }
}
