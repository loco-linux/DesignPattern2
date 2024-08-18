package Main;

import Interfaces.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import patronDecorator.ComponenteConcreto;
import patronDecorator.DecoradorConcretoA;
import patronDecorator.DecoradorConcretoB;


public class Main {
    public static void main(String[] args) {
            
    new Thread(()->{
        try {
                DiscountManager.getInstance();
                
                // Crear componente concreto
                Component componente = new ComponenteConcreto(); 
                
                // Decorar el componente con funcionalidades adicionales
                Component componenteDecoradorA = new DecoradorConcretoA(componente);
                Component componenteDecoradorB = new DecoradorConcretoB(componente);
                
                // Operar sobre el componente original y los decoradores
                componente.operacion();
                System.out.println("----------------------------------");
                componenteDecoradorA.operacion();
                System.out.println("----------------------------------");
                componenteDecoradorB.operacion();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }){            
        }.start();
        
    
    }
}
