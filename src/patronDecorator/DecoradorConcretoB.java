package patronDecorator;

import Interfaces.Component;


public class DecoradorConcretoB extends Decorator {
    
    public DecoradorConcretoB(Component componente) {
        super(componente);
    }
    
    @Override
    public String operacion(){        
        // Agregar funcionalidad adicional al componente
        return super.operacion() + " Operacion B: Aplica descuento de 20% en zapatos";
    }

    @Override
    public double descuento(double precio) {
        return precio * 0.8;
        }
    
}
