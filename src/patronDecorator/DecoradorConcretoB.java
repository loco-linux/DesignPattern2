package patronDecorator;

import Interfaces.Component;


public class DecoradorConcretoB extends Decorator {
    
    public DecoradorConcretoB(Component componente) {
        super(componente);
    }
    
    @Override
    public void operacion(){
        super.operacion();
        // Agregar funcionalidad adicional al componente
        System.out.println("Operacion B");
    }
    
}
