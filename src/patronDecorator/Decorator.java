package patronDecorator;

import Interfaces.Component;


// Decorador: Clase abstracta que implementa la interfaz del componente
public abstract class Decorator implements Component {
    protected Component componente;
    
    public Decorator(Component componente){
        this.componente = componente;
    }
    
    @Override
    public void operacion() {
        componente.operacion();
    }
    
}
