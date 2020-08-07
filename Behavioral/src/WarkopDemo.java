import State.Pesanan;
import State.PesananDikirimState;
import State.PesananDiprosesState;
import State.PesananState;
import Template.Delivery;
import Template.Pengiriman;

public class WarkopDemo {

    public static void main(String[] args) {
        //State Pattern
        PesananState pesanandiproses = new PesananDiprosesState();
        PesananState pesanandikirim = new PesananDikirimState();

        Pesanan pesanan = new Pesanan();
        pesanan.SetPesananState(pesanandikirim);

        //Template Pattern
        Pengiriman pengiriman = new Delivery();
        pengiriman.pengiriman();

    }
}

