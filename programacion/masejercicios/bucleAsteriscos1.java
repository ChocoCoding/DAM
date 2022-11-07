package ciclo.DAM.primera.evaluacion.programacion.masejercicios;

/**
 * @Author: Gonzalo Campos Dominguez
 * @Date: 28/10/2022
 */
public class bucleAsteriscos1 {
    public static void main(String[] args) {
        String asterisco = "*";
        for (int i = 1; i<= 5; i++ ){
            System.out.println(asterisco);
            asterisco = asterisco + "*";
        }
    }
}
