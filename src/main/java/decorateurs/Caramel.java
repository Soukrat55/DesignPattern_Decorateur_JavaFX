package decorateurs;

import boissons.Boisson;

public class Caramel extends AbstractDecorator{
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    public double cout(){
        return 0.9 + boisson.cout();
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+"  _Au Caramel ";
    }

}
