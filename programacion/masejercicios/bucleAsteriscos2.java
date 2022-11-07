package ciclo.DAM.primera.evaluacion.programacion.masejercicios;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 04/11/2022
 */
public class bucleAsteriscos2 {
    public static void main(String[] args) {

        for(int altura = 1; altura<=4; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=4-altura; blancos++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
