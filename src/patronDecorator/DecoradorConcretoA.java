package patronDecorator;

import Interfaces.Component;


public class DecoradorConcretoA extends Decorator {
    
    public DecoradorConcretoA(Component componente) {
        super(componente);
    }
    
    @Override
    public void operacion(){
        super.operacion();
        // Agregar funcionalidad adicional al componente
        System.out.println("Operacion A");
    }
    
}
