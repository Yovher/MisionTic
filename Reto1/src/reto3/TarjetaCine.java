/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto3;

import java.util.Arrays;

/**
 *
 * @author crisolto
 */
public class TarjetaCine {

    private String idTarjeta;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private int edad;
    double porcentajeDescuento;

   

    public TarjetaCine(String idTargeta, String nombreCompleto, String email, String telefono, int edad, double porcentajeDescuento) {
        this.idTarjeta = idTargeta;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double pagar(String[] cuenta) {
        double total = 0;

        for (int i = 0; i < cuenta.length; i++) {

            if (cuenta[i].equalsIgnoreCase("Boleta")) {
                total = total + 6000;
            } else if (cuenta[i].equalsIgnoreCase("Combo1 - Crispetas + Gaseosa")) {
                total = total + 8000;
            } else if (cuenta[i].equalsIgnoreCase("Combo2 - Perro + Gaseosa")) {
                total = total + 12000;
            }
        }

        double resultado = total * (1 - porcentajeDescuento / 100);
        return resultado;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

   
}
