package Nivel5;

public class Operacion {
    String tipo; 
    double monto;
    public Operacion(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    @Override
    public String toString() {
        return "Operaion [tipo=" + tipo + ", monto=" + monto + "]";
    }
    
}
