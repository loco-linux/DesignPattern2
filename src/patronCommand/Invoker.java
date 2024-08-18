package patronCommand;

import Interfaces.Command;
import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> comandos = new ArrayList<>();
    
    public void agregarComando(Command comando){
        comandos.add(comando);
    }
    
    public void ejecutarComandos(){
        for(Command comando : comandos){
            comando.ejecutar();
        }
    }
}
