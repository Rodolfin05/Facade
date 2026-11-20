package padraofacade;

public class Enfermaria extends Setor {

    private static Enfermaria enfermaria = new Enfermaria();

    private Enfermaria() {};

    public static Enfermaria getInstancia() {
        return enfermaria;
    }
}
