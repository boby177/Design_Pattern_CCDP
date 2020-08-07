package Template;

public abstract class Pengiriman {

    public abstract void biayapengiriman();

    public final void pengiriman() {
        biayapengiriman();
    }

}
