package Main;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
            
    new Thread(()->{
        try {           
                DiscountManager discountManager = DiscountManager.getInstance();
                
                double precioOriginal = 10000.0;
                
                System.out.println("----------------------------------------");
                System.out.println("Precio original: $" + precioOriginal);
                System.out.println("Precio con descuento normal: $" + discountManager.descuentos(precioOriginal, "todos"));
                System.out.println("Precio con descuento por zapatos: $" + discountManager.descuentos(precioOriginal, "zapatos"));
                System.out.println("Precio sin descuento: $" + discountManager.descuentos(precioOriginal, "NONE"));
                System.out.println("----------------------------------------");
                // Demostrar que siempre se obtiene la misma instancia
                DiscountManager anotherDiscountManager = DiscountManager.getInstance();
                System.out.println("Es la misma instancia? " + (discountManager == anotherDiscountManager));
                               
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }){            
        }.start();
        
    
    }
}
