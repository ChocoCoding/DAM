package ciclo.DAM.primera.evaluacion.programacion.masejercicios;

import java.util.Scanner;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 04/11/2022
 */
public class numeroOmirp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero != invNum(numero) && esPrimo(numero) && esPrimo(invNum(numero))) {
            System.out.println("El numero " + numero + " es Omirp y su invertido es: " + invNum(numero));
        }else {
            System.out.println("El numero " + numero + " no es Omirp");
        }

    }

    public static int invNum(int n) {
        int nDigitos = Integer.toString(n).length();
        int nInv = 0;

        if (nDigitos == 1) {
            return n;
        } else {
            for (int i = 0; i < nDigitos; i++) {
                if (i == 0) {
                    nInv += (n % 10) * Math.round(Math.pow(10, (nDigitos - 1)));
                } else if (i == nDigitos - 1) {
                    nInv += n / Math.round(Math.pow(10, (nDigitos - 1)));
                } else {
                    nInv += (n / Math.round(Math.pow(10, i))) % 10
                            * Math.round(Math.pow(10, (nDigitos - 1 - i)));
                }
            }
        }

        if (nInv < 0) {
            return nInv / 10;
        } else {
            return nInv;
        }
    }
    public static boolean esPrimo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}



