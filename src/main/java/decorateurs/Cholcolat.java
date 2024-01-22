package decorateurs;

import boissons.Boisson;

public class Cholcolat extends AbstractDecorator{
    public Cholcolat(Boisson boisson) {
        super(boisson);
    }

    public double cout(){
        return 0.7+ boisson.cout();
    }
    @Override
    public String getDescription() {  return boisson.getDescription()+" _Au Chocolat";  }


}
