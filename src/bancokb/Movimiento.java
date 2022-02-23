
package bancokb;



public class Movimiento {
    String TipoMovimiento;
    String FechaMovimiento;
    double monto;

    public Movimiento() {
        
    }

    public String getTipoMovimiento() {
        return TipoMovimiento;
    }

    public void setTipoMovimiento(String TipoMovimiento) {
        this.TipoMovimiento = TipoMovimiento;
    }

    public String getFechaMovimiento() {
        return FechaMovimiento;
    }

    public void setFechaMovimiento(String FechaMovimiento) {
        this.FechaMovimiento = FechaMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
