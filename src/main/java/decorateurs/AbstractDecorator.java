package decorateurs;

import boissons.Boisson;

public abstract class AbstractDecorator extends Boisson {
    protected Boisson boisson;//protected pour reutiliser les classes
    public AbstractDecorator(Boisson boisson){
        super();
        this.boisson=boisson;
    }

    public abstract String getDescription();
}
