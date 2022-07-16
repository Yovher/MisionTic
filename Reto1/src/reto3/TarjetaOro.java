/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3;

/**
 *
 * @author crisolto
 */
public class TarjetaOro extends TarjetaCine{
    private String [] beneficiosDescripcion={"Boleto Gratis","Crispetas Gratis","Gaseosa Gratis"};
    private boolean [] beneficiosEstado={true, true, true};
  
    private static final double PORCENTAJE_DESCUENTO = 20;

    public TarjetaOro(String idTargeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTargeta, nombreCompleto, email, telefono, edad, PORCENTAJE_DESCUENTO);
    }

    public String[] getBeneficiosDescripcion() {
        return beneficiosDescripcion;
    }

    public void setBeneficiosDescripcion(String[] beneficiosDescripcion) {
        this.beneficiosDescripcion = beneficiosDescripcion;
    }

    public boolean[] getBeneficiosEstado() {
        return beneficiosEstado;
    }

    public void setBeneficiosEstado(boolean[] beneficiosEstado) {
        this.beneficiosEstado = beneficiosEstado;
    }

    
   public boolean redimirBeneficio (int posicionBeneficio){        
       if(beneficiosEstado[posicionBeneficio]==true){
           beneficiosEstado[posicionBeneficio]=false;
           return true;
       }else{
           return false;
       }       
   }
    
    
}
