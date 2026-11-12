
public interface Observable {

    void suscribir(Suscriptor s);

    void desuscribir(Suscriptor s);

    void notificar();

}
