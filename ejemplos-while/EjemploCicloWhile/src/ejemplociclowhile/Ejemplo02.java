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
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        int contador = 1;
        System.out.println("Ingrese el Límite"); // 6
        limite = entrada.nextInt();
        while (contador <= limite) {
            if (contador % 2 != 0) {
                System.out.printf("Contador %d\n",
                        contador);
            }
            contador = contador + 1;
        }
    }
}
/* El programa ejecuta un ciclo repetitivo bajo la condicion impuesta dentro
del mismo que dicta qe el valor que se ingrese como limite hara que el programa
presente todos los valores que existan UNICAMENTE IMPARES que lleguen o se 
acerquen a ese limite, esto sucede por que la condicion del if toma solo los
valores cuyo modulo es 1, los cuales son justamente los IMPARES.
*/
