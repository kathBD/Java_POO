
package bancokb;
import java.util.ArrayList;


public class Cliente {
    String Nombre;
    String Telefono;
    String email;
    
    ArrayList <Cuenta> miscuentas;
    
    public Cliente(){
        miscuentas = new ArrayList<Cuenta>();
        
    }
    public void addCuenta (Cuenta c){
     miscuentas.add(c);
}

    public ArrayList<Cuenta> getMiscuentas() {
        return miscuentas;
    }

    public void setMiscuentas(ArrayList<Cuenta> miscuentas) {
        this.miscuentas = miscuentas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
