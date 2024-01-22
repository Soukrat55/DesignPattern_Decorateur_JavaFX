package boissons;

public class Expresso extends Boisson{
    public Expresso(){
        this.description="Expresso__";
    }
    @Override
    public double cout() {
        return 6;
    }
}
