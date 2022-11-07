package ciclo.DAM.primera.evaluacion.programacion.ejerciciosbasicos;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 21/10/2022
 * //Calcular la media aritmética de 7 notas
 * //numéricas introducidas por teclado
 */

public class MediaNotas_10 {
    
    public static void calcularMedia() {
        Scanner sc = new Scanner(System.in);
        int sumaNotas = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Escribe un numero");
            int num = sc.nextInt();
            sumaNotas += num;
            
        }
        System.out.println("media = " + sumaNotas/7);
    }

    public static void main(String[] args) {
        calcularMedia();
    }

}
