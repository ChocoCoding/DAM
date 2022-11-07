package ciclo.DAM.primera.evaluacion.programacion.ejerciciosbasicos;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 25/10/2022
 * //  A un trabajador le descuentan de su sueldo el 10% hasta los 1000 euros,
 * // si cobra entre 1000 y 2000 , a mayores el 5% del adicional, y por encima
 * // de 2000 el 3% del adicional (sobre 2000). Calcular el descuento y sueldo neto que recibe el
 * // trabajador dado su sueldo.
 */
public class CalcularSueldos_22 {
    public static void main(String[] args) {
        calcularSueldos();
    }

    private static void calcularSueldos() {
        Scanner sc = new Scanner(System.in);

        double descuento,sueldo;
        sueldo = sc.nextFloat();
        descuento = 0;

        if (sueldo <= 1000) {
            descuento = (sueldo * 0.1);
        } else if (sueldo >= 1000 && sueldo<=2000) {
            descuento = 1000 * 0.1 + (sueldo - 1000)* 0.05;
        } else if (sueldo >= 2000) {
            descuento = (1000 * 0.1) + (sueldo - 1000) * 0.03;
        }
        System.out.println("Descuento: " + descuento);
        System.out.println("Sueldo: " + (sueldo - descuento));
    }
}
