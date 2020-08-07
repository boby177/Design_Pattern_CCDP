package AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String menuMinuman){
        if (menuMinuman == "Kopi Senja"){
            return new KopiFactory();
        }else{
            return new TehFactory();
        }
    }
}

