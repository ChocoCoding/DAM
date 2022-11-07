package ciclo.DAM.primera.evaluacion.programacion.E0_Enunciados_ejercicios;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 25/10/2022
 */
public class Calcular_Letras_Aleatorias_24 {
    public static void main(String[] args) {
        calcularLetras();
    }

    private static void calcularLetras() {
        char caracter = (char)(Math.random()*26+'A');

        if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
            System.out.println("La letra " + caracter + " es vocal");
        }else {
            System.out.println("La letra " + caracter + " es consonante");
        }
    }
}
