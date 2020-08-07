import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import AbstractFactory.Minuman;
import Singleton.WarkopGreeting;

import java.util.ArrayList;


public class WarkopDemo {
    public static void main(String[] args) {
        ArrayList<String> daftarmenu = new ArrayList<>();
        daftarmenu.add("Kopi Senja");
        daftarmenu.add("Teh Manis");

        //Singleton
        WarkopGreeting menu = WarkopGreeting.getWarkop();

        for (String s : daftarmenu) {

            menu.Menu(s);

            //AbstractFactory
            AbstractFactory kopiFactory = FactoryProducer.getFactory(s);
            Minuman descmenu = kopiFactory.menuMinuman();
            descmenu.deskripsi();
            System.out.println();
        }


    }
}
