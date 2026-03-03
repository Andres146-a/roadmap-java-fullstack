package Nivel5;
import java.util.*;
public class Cuenta {
    private int numeroCuenta; 
    private double saldo; 
    private String tipoCuenta;

    private ArrayList<Operacion>historial;
    private Usuario dueno;


    public Cuenta(int numeroCuenta, double saldo, String tipoCuenta, Usuario dueno, Operacion historial){
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldo;
            this.tipoCuenta = tipoCuenta;
            this.dueno = dueno;
            this.historial = new ArrayList<>();
    };

    //getters; 
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getTipoCuenta(){
        return tipoCuenta;
    }
    public void setTipoCuenta(String tipoCuenta){
        this.tipoCuenta = tipoCuenta;
    }
    public Usuario getDuenio(){
        return dueno;
    }

    public void setDuenio(Usuario dueno){
        this.dueno = dueno;
    }

    public ArrayList<Operacion> getHistorial(){
        return historial;
    }
    public void setHisto(ArrayList<Operacion> historial){
        this.historial = historial;
    }

    @Override
    public String toString(){
        return "Cuenta N°: " + numeroCuenta + 
           " | Tipo: " + tipoCuenta + 
           " | Saldo: $" + saldo +
           " | Dueño: " + (dueno != null ? dueno.getNombre() : "Sin dueño") +
           " | Operaciones: " + (historial != null ? historial.size() : 0);
}
}
