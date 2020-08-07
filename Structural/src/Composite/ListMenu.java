package Composite;

import java.util.ArrayList;
import java.util.List;

public class ListMenu implements Menu{
    private List<Menu> listMenu = new ArrayList<>();

    public void tampilmenu() {
        for(Menu m:listMenu){
            m.tampilmenu();
        }
    }
    void Add(Menu menu){
        listMenu.add(menu);
    }

}
