/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3;

/**
 *
 * @author crisolto
 */
public class TarjetaPlata extends TarjetaCine{
    private int cantidadVisitas=0;
    private boolean elegibleOro=false;
    private static final int PORCENTAJE_DESCUENTO = 10;
       /*Constructor */ 

    public TarjetaPlata(String idTargeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTargeta, nombreCompleto, email, telefono, edad, PORCENTAJE_DESCUENTO);
    }

    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public boolean isElegibleOro() {
        return elegibleOro;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }
   @Override
    public double pagar(String[] cuenta) {
        double total = 0;

        for (int i = 0; i < cuenta.length; i++) {

            if (cuenta[i].equalsIgnoreCase("boleta")) {
                total = total + 6000;
            } else if (cuenta[i].equalsIgnoreCase("Combo1 - Crispetas + Gaseosa")) {
                total = total + 8000;
            } else if (cuenta[i].equalsIgnoreCase("Combo2 - Perro + Gaseosa")) {
                total = total + 12000;
            }
        }

        double resultado = total * (1 - PORCENTAJE_DESCUENTO / 100);
        cantidadVisitas++;
        if(cantidadVisitas==5){
            elegibleOro=true;
        }
        return resultado;
    }
    
}
