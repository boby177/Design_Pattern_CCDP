package AbstractFactory;

public class KopiFactory extends AbstractFactory {

    @Override
    public Minuman menuMinuman(){
        return new KopiSenja();
    }
}
