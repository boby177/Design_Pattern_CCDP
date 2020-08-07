package AbstractFactory;

public class TehFactory extends AbstractFactory {

    @Override
    public Minuman menuMinuman(){
        return new TehManis();
    }
}