package Composite;

public class DeskripsiMenu implements Menu{

    private String deskripsi;
    private String menu;
    private int harga;

    DeskripsiMenu(String menu, String deskripsi, int harga) {
        this.menu=menu;
        this.deskripsi=deskripsi;
        this.harga=harga;
    }

    private String getMenu() {
        return menu;
    }

    private String getDeskripsi() {
        return deskripsi;
    }

    private int getHarga() {
        return harga;
    }

    @Override
    public void tampilmenu() {
        System.out.println(getMenu());
        System.out.println(getDeskripsi());
        System.out.println("Rp. "+getHarga());
        System.out.println();
    }
}