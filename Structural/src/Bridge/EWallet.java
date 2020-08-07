package Bridge;

public class EWallet extends PembayaranAbstract {

    public EWallet(Pengiriman pengiriman) {
        super(pengiriman);
    }

    @Override
    void metodePembayaran() {
        System.out.println("Pembayaran E-Wallet");
        System.out.println("Biaya Admin = 1000");
        pengiriman.metodePengiriman();
    }
}
