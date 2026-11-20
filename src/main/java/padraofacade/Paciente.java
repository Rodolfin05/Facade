package padraofacade;

public class Paciente {

    public boolean receberAlta() {
        return PacienteFacade.verificarPendenciasAlta(this);
    }
}
