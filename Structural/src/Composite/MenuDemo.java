package Composite;

public class MenuDemo {
    public static void main(String[] args) {
        ListMenu menu = new ListMenu();
        menu.Add(new DeskripsiMenu("Kopi Senja", "Kopi yang khusus dibuat untuk Penikmat Indie"
                , 10000));
        menu.Add(new DeskripsiMenu("Teh Manis", "Teh yang bikin diabetes kalo minumnya bareng doi"
                , 5000));

        System.out.println("Menu:");
        menu.tampilmenu();

    }
}
