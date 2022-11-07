package ciclo.DAM.primera.evaluacion.programacion.ejerciciosbasicos;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 21/10/2022
 * // Escribir un Pseudocódigo que encuentre y despliegue los números primos entre uno y cien.
 * // Un número primo es divisible entre el mismo y la unidad por lo tanto un numero primo no
 * // puede ser par excepto el dos (2).
 */
public class NumPrimos_15 {
    public static void main(String[] args) {
     calcularPrimos();
    }

    private static void calcularPrimos() {
        int primo;
        for (int aux = 1; aux <= 100; aux++){
            int contDivisores = 0;
            for(int auxB = 1; auxB <= aux; auxB++){
                if (aux % auxB == 0){
                    contDivisores = contDivisores + 1;
                }
            }
            if (contDivisores <= 2 ){

                System.out.println("El numero " + aux + " es primo");
            }else
                System.out.println("El numero " + aux + " no es primo");

        }

    }

}
