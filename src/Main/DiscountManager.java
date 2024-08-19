package Main;

// Utilizando Patrón Singleton

import Interfaces.Component;
import patronDecorator.ComponenteConcreto;
import patronDecorator.DecoradorConcretoA;
import patronDecorator.DecoradorConcretoB;


public class DiscountManager {
    private static DiscountManager instance = null;
    
    private static int numeroInstancias=0;

    
    private DiscountManager(){
        // Constructor privado para evitar instancias directas
    }
    
    public static DiscountManager getInstance() throws InterruptedException{
        if(instance == null){
            Thread.sleep(500);
            /*
            Solo se permite la ejecucion del bloque por un solo proceso al mismo tiempo.
            Los demas procesos van quedando en espera hasta que el anterior que esta utilizando el bloque termine.
            */
            synchronized(DiscountManager.class){
                if(instance == null){
                    instance = new DiscountManager();  
                    numeroInstancias++;
                    System.out.println("---> Numero de instancias creadas: " + numeroInstancias + "\n");                                 
                }
            }
            
        }
        return instance;
    }
    
    // Metodo para aplicar descuentos
    public double descuentos(double precio, String tipoDescuento){
        
        // Crear componente concreto
        Component componente = new ComponenteConcreto(); 
                
        // Decorar el componente con funcionalidades adicionales
        Component componenteDecoradorA = new DecoradorConcretoA(componente);
        Component componenteDecoradorB = new DecoradorConcretoB(componente);       
        
        // Operar sobre el componente original y los decoradores
        switch (tipoDescuento) {
            case "todos" -> {
                System.out.println(componenteDecoradorA.operacion());
                return componenteDecoradorA.descuento(precio); // 10% descuento
            }
            case "zapatos" -> {
                System.out.println(componenteDecoradorB.operacion());
                return componenteDecoradorB.descuento(precio); // 20% descuento
            }
            default -> {
                return componente.descuento(precio); // sin descuento
            }
        }
                
    }
}
