package Bridge;

public abstract class PembayaranAbstract {

    protected Pengiriman pengiriman;

    public PembayaranAbstract(Pengiriman pengiriman) {
        this.pengiriman = pengiriman;
    }

    abstract void metodePembayaran();

}

