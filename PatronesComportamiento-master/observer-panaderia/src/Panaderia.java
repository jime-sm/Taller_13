
import java.util.ArrayList;

public class Panaderia implements Observable {

    private boolean hay_Pan = false;

    private ArrayList<Suscriptor> suscriptores =
            new ArrayList<>();

    @Override
    public void suscribir(Suscriptor s) {
        suscriptores.add(s);
        System.out.println("Nuevo vecino suscrito.");
    }

    @Override
    public void desuscribir(Suscriptor s) {
        suscriptores.remove(s);
        System.out.println("Vecino eliminado.");
    }

    @Override
    public void notificar() {
        for (Suscriptor s : suscriptores) {
            s.actualizar();
        }
    }

    public void sacarPan() {
        hay_Pan = true;

        System.out.println("\n>> Salio el pan caliente");

        notificar();
    }

    public boolean hay_Pan() {
        return hay_Pan;
    }
}


