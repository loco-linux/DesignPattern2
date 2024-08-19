package patronDecorator;

import Interfaces.Component;


public class DecoradorConcretoA extends Decorator {
    
    public DecoradorConcretoA(Component componente) {
        super(componente);
    }
    
    @Override
    public String operacion(){        
        // Agregar funcionalidad adicional al componente
        return super.operacion() + " Operacion A: Aplica descuento de 10% en todos los productos.";
    }

    @Override
    public double descuento(double precio) {
        return precio * 0.9;
    }
    
}
