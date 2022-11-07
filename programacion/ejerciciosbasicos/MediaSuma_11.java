package ciclo.DAM.primera.evaluacion.programacion.ejerciciosbasicos;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 21/10/2022
 * //Algoritmo que pida números hasta que se introduzca un cero.
 * //Debe imprimir la suma y la media de todos los números introducidos.
 */
public class MediaSuma_11 {


    public static void main(String[] args) {
        calcularSuma();

    }

    private static void calcularSuma() {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma;
        int sumaNum = 0;
        int cont = 0;
        do {
            System.out.println("Introduzca un numero");
            num = sc.nextInt();
            sumaNum += num;
            cont += cont;
        }while(num!= 0);
        int media = sumaNum / cont;
        System.out.println("La suma de los numeros es: " + sumaNum);
        System.out.println("La media de los numeros es: " + media);
    }



}
