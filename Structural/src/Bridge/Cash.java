package Bridge;

public class Cash extends PembayaranAbstract{

    public Cash(Pengiriman pengiriman) {
        super(pengiriman);
    }

    @Override
    void metodePembayaran() {
        System.out.println("Pembayaran Cash");
        pengiriman.metodePengiriman();
    }
}
