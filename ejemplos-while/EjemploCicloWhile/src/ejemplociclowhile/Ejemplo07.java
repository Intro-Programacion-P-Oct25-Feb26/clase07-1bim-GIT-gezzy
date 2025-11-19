/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double suma_total = 0;
        double promedio_final;
        double calificacion;
        boolean bandera = true;

        int contador = 0;

        System.out.println("Ingrese las notas de los estudiantes de su materia");
        while (bandera) { // true == ture >> true | Ingreso al ciclo
                          // false == ture >> false | Salgo del ciclo
            System.out.println("Ingrese calificación");
            calificacion = entrada.nextDouble(); // 7 | 9.5
            suma_total = suma_total + calificacion; // 7 + 0 = 7 | 7 + 9.5 = 16.5
            contador = contador + 1; // 0 + 1 = 1 | 1 = 1 + 2
            // proceso para salir del ciclo.
            System.out.println("Ingrese el valor de -1 para salir del ciclo");
            int temporal = entrada.nextInt(); // 2 | -1
            if (temporal == -1) { // 2 | -1
                bandera = false; // flase == flase >> false
            }

        }

        promedio_final = suma_total / contador;
        System.out.printf("El promedio final es %.2f\n", promedio_final);

    }
}

/* El programa permite calcular el promedio de notas ingresadas por el usuario,
siempre y cuando el ususario decida mantenerse en el ciclo. Una vez el usuario
decida terminr con el ciclo el programa calculara el promedio tomando la suma
de las notas tomadas por el acumulador y dividiendo para el numero de notas
tomadas por el contador.
*/
