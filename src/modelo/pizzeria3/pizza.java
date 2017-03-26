
package modelo.pizzeria3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;


public class pizza {
     
    private String masa;
    private String tipo;
    private String tamaño;
    private Map<ToggleButton,Double>precios = new HashMap<>();

    public pizza(String masa, String tipo, String tamaño) {
        this.masa = masa;
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public double returs(){
        ToggleButton boton;
        double precio=0;
    Iterator <ToggleButton> it = precios.keySet().iterator();
    while (it.hasNext()){
        boton = it.next();
        if (boton.isSelected()){
            precio += precios.get(boton);
        }
    }
    return precio;
}
    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
}
