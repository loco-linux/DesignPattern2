package patronCommand;

import Interfaces.Command;

public class ComandoConcreto implements Command{
    private Receiver receiver;

    public ComandoConcreto(Receiver receiver){
        this.receiver = receiver;
    }
    
    @Override
    public void ejecutar() {
        receiver.accion();
    }
    
    
}
