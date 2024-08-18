package patronDecorator;

import Interfaces.Component;


// representa los productos de la tienda y conteniendo la logica base de aplicar descuentos 

public class ComponenteConcreto implements Component {
    @Override
    public void operacion(){
        // Implementacion del componente concreto
        System.out.println("Operacion en el componente concreto");
    }
}

