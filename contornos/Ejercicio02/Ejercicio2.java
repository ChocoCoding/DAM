package ciclo.DAM.primera.evaluacion.contornos.Ejercicio02;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Comercial comercial1 = new Comercial();

        /* Input */
        System.out.println("Escriba el nombre del comercial :");
        comercial1.nombre = sc.nextLine();

        System.out.println("¿Qué idioma sabe? :");
        comercial1.idioma = sc.nextLine();



        System.out.println(comercial1);
    }

}