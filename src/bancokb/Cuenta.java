
package bancokb;

import java.util.ArrayList;


public class Cuenta {
    String TipoCuenta;
    double MontoInicial;
    ArrayList<Movimiento> mismovimientos;
    
    public Cuenta(){
        mismovimientos = new ArrayList<Movimiento>();
        
    }
    
    public void addMovimiento(Movimiento m){
        mismovimientos.add(m);
        
    }

    public ArrayList<Movimiento> getMismovimientos() {
        return mismovimientos;
    }

    public void setMismovimientos(ArrayList<Movimiento> mismovimientos) {
        this.mismovimientos = mismovimientos;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    public double getMontoInicial() {
        return MontoInicial;
    }

    public void setMontoInicial(double MontoInicial) {
        this.MontoInicial = MontoInicial;
    }
    
}
