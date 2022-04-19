/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatecnica.entidad;

/**
 *
 * @author aposso
 */
public class Alcancia {
    private int cincuenta;
    private int cien;
    private int doscientos;
    private int quinientos;
    private int mil;
    private int totalMonedas;
    private int totalDinero;
    

    public Alcancia() {
        this.cincuenta = 0;
        this.cien = 0;
        this.doscientos = 0;
        this.quinientos = 0;
        this.mil = 0;
        this.totalMonedas = 0;
        this.totalDinero = 0;
    }   

    public int getTotalMonedas() {
        return totalMonedas;
    }

    public void setTotalMonedas() {
        this.totalMonedas = totalMonedas + 1;
    }

    public int getTotalDinero() {
        return totalDinero;
    }

    public void setTotalDinero(int dinero) {
        this.totalDinero = this.totalDinero + dinero;
    }
    
    
    public int getCincuenta() {
        return cincuenta;
    }

    public void setCincuenta() {
        this.cincuenta = cincuenta + 1;
    }

    public int getCien() {
        return cien;
    }

    public void setCien() {
        this.cien = cien + 1;
    }

    public int getDoscientos() {
        return doscientos;
    }

    public void setDoscientos() {
        this.doscientos = doscientos + 1 ;
    }

    public int getQuinientos() {
        return quinientos;
    }

    public void setQuinientos() {
        this.quinientos = quinientos + 1;
    }

    public int getMil() {
        return mil;
    }

    public void setMil() {
        this.mil = mil + 1;
    }
    
    
    
}
