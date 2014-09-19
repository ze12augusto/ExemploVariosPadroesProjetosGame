package game;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a12027227
 */
public class Cenario {

    private String tipoTerreno;
    private List<Observer> observers = new ArrayList<>();

    public void setTipoTerreno(String tipoTerreno) {
        String terrenoAntigo = this.tipoTerreno;
        this.tipoTerreno = tipoTerreno;

        notificaMudancaCenario(tipoTerreno);

    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notificaMudancaCenario(String tipoTerreno) {

        for (Observer observer : observers) {

            observer.mudancaTerreno(tipoTerreno);
        }
    }
}
