package Bridge;

public class PembayaranDemo {
    public static void main(String[] args) {
        PembayaranAbstract pembayaran = new EWallet(new Delivery());

        pembayaran.metodePembayaran();
    }
}
