import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por registrar os observers de um assunto
 */
public abstract class Assunto {
    private List<Observer> Observers = new ArrayList<>();

    /**
     * Recebe uma classe que irá observar um assunto
     * 
     * @param Observer
     */
    protected void RegistrarObserver(Observer Observer) {
        Observers.add(Observer);
    }

    /**
     * Notifica os observadores que hove a atualização em um status
     */
    protected void NotificarObservers() {
        /* Loop notificando cada um dos observers registrados */
        for (Observer observer : Observers) {
            observer.Atualizar();
        }
    }
}
