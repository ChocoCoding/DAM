package ciclo.DAM.primera.evaluacion.programacion.ejerciciosbasicos;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 25/10/2022
 * //Diseñar el algoritmo (ordinograma y pseudocódigo) correspondiente a un programa
 * //que exprese en horas, minutos y segundos un tiempo expresado en segundos.
 */
public class SegundosHoras_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seg;
        System.out.println("Introduce un número");
        seg = sc.nextInt();
        calularSegundos(seg);
    }

    private static void calularSegundos(int segSP) {
        int hora, minuto, modHora,modminuto;
        hora = segSP / 3600;
        modHora = segSP % 3600;
        minuto = modHora / 60;
        modminuto = modHora % 60;

        System.out.println("Horas: " + hora + "\nMinutos: " + minuto + "\nSegundos: " + modminuto);
    }
}
