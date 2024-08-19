package patronDecorator;

import Interfaces.Component;


// representa los productos de la tienda y conteniendo la logica base de aplicar descuentos 

public class ComponenteConcreto implements Component {
    @Override
    public String operacion(){
        // Implementacion del componente concreto
        return "Descuentos";
    }

    @Override
    public double descuento(double precio) {
        return precio;
    }
}

