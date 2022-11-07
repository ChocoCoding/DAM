package ciclo.DAM.primera.evaluacion.programacion.E0_Enunciados_ejercicios;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 25/10/2022
 */
public class Ejercicio_billetes {
    public static void main(String[] args) {
        calcularBilletes();
    }

    private static void calcularBilletes() {
        Scanner sc = new Scanner(System.in);
        int euros = sc.nextInt();
        int billete500 = euros / 500;
        int resto500 = euros % 500;
        int billete200 = resto500 / 500;
        int resto200 = euros % 200;
        int billete100 = resto200 / 100;
        int resto100 = resto200 % 100;
        int billete50 = resto100 / 50;
        int resto50 = resto100 % 50;
        int billete20 = resto50 / 20;
        int resto20 = resto50 % 20;
        int billete10 = resto20 / 10;
        int resto10 = resto20 % 10;
        int billete5 = resto10 / 5;
        int sobrante = resto10 % 5;
    }
    
}
