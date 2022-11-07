package ciclo.DAM.primera.evaluacion.contornos.Ejercicio03;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 24/10/2022
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Comercial comercial3 = new Comercial();

        System.out.println("Escribe el nombre del comercial: ");
        comercial3.nombre = sc.nextLine();

        System.out.println("Escribe el lenguaje del comercial");
        comercial3.idioma = sc.nextLine();

        System.out.println(comercial3);
    }
}
