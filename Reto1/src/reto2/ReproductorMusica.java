/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto2;

import java.util.Arrays;

/**
 *
 * @author crisolto
 */
public class ReproductorMusica {

    String canciones[];
    int cancionesFavoritas[];
    boolean pausado;
    int cancionReproduciendo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 2");
        String[] cancionesEscogidas = new String[]{"Mil horas", "Por ese hombre", "A esa", "Algo de mi", "Si me dejas ahora", "¿Quieres ser mi amante?", "Quel sorriso in volto", "Per una notte insieme", "Como un pintor", "Sencillamente", "Un segundo", "Enciéndeme", "Cuando me enamoro", "Tu eres mi tesoro", "Piccola anima", "Solo a ti pertenezco", "Todos por todos"};
        ReproductorMusica ventana1 = new ReproductorMusica(cancionesEscogidas);
        ventana1.devolverCancion();
        ventana1.devolverCancion(); 
        ventana1.devolverCancion(); 
        ventana1.devolverCancion();
        System.out.println(Arrays.toString(ventana1.canciones));
        System.out.println(Arrays.toString(ventana1.cancionesFavoritas));
        System.out.println(ventana1.pausado);
        System.out.println(ventana1.cancionReproduciendo);
        //System.out.println(Arrays.toString(cancionesEscogidas));
        

    }

    public ReproductorMusica(String[] canciones) {
        this.canciones=canciones;
        this.cancionesFavoritas=new int[canciones.length];
        for (int i = 0; i<canciones.length; i++) {
            this.cancionesFavoritas[i]=-1;
        }
        this.pausado=true;
        this.cancionReproduciendo=0;
    }

    public void proximaCancion() {
        cancionReproduciendo = (cancionReproduciendo + 1) % canciones.length;
    }

    public void devolverCancion() {
        cancionReproduciendo = (cancionReproduciendo + canciones.length - 1) % canciones.length;
    }

    public void cambiarEstadoReproduccion() {
        if (pausado = true) {
            pausado = false;
        } 
    }

    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCancionesFavoritas() {
        for (int i = 0; i < cancionesFavoritas.length; i++) /*En caso de que encuentre que cancionReproduciendo está en el banco de cancionesFavoritas
            no seguimos buscando espacio libre para agregarla, y salimos del método*/ {
            if (cancionesFavoritas[i] == cancionReproduciendo) {
                return;
            } //Pero si no la encontró, y además encuentra un espacio donde añadirlo, lo hace
            else if (cancionesFavoritas[i] == -1) {
                cancionesFavoritas[i] = cancionReproduciendo;
                return;
            }
        }
    }

    public String[] getCanciones() {
        return canciones;
    }

    public void setCanciones(String[] canciones) {
        this.canciones = canciones;
    }

    public int[] getCancionesFavoritas() {
        return cancionesFavoritas;
    }

    public void setCancionesFavoritas(int[] cancionesFavoritas) {
        this.cancionesFavoritas = cancionesFavoritas;
    }

    public boolean isPausado() {
        return pausado;
    }

    public void setPausado(boolean pausado) {
        this.pausado = pausado;
    }

    public int getCancionReproduciendo() {
        return cancionReproduciendo;
    }

    public void setCancionReproduciendo(int cancionReproduciendo) {
        this.cancionReproduciendo = cancionReproduciendo;
    }
}
