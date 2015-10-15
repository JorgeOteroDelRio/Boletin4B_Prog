
package boletin4b;
import javax.swing.JOptionPane;

public class Boletin4B {

    
    public static void main(String[] args) {
        Consumo consumo1 = new Consumo();
        consumo1.setlitros(50f);
        consumo1.setPGas(1.57f);
        Consumo consumo2 = new Consumo(5.6f,4f,67f,2.63f);
        JOptionPane.showMessageDialog(null,"El consumo medio del primer vehículo es de " + consumo2.consumoMedio() + " litros");
        consumo2.setlitros(4.5f);
        JOptionPane.showMessageDialog(null,"La velocidad media del segundo vehículo es de " + consumo2.getVMed() + " km/h");
        
    }
    
}
