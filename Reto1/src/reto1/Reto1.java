/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;

import java.util.Arrays;

/**
 *
 * @author crisolto
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] compra = {2700, 9500, 300, 15000, 1800, 10000, 400, 3000, 400};
        int[] compra2 = {6700};
        //int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        reporte(compra);
        reporte(compra2);

    }

    public static int[] reporte(int []compra) {

        int suma = 0;
        int numeromayor = compra[0];
        int numeromenor = compra[0];
        for (int i = 0; i < compra.length; i++) {

            suma = suma + compra[i];
            if (compra[i] > numeromayor) { // 
                numeromayor = compra[i];

            }
            if (compra[i] < numeromenor) { // 
                numeromenor = compra[i];

            }

        }

        int[] respuesta = new int[3];
        respuesta[0] = suma;
        respuesta[1] = numeromenor;
       respuesta[2] = numeromayor;

        System.out.println(Arrays.toString(respuesta));
        return respuesta;
    }

}
