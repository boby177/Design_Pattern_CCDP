package Template;

public class PickUp extends Pengiriman {

    @Override
    public void biayapengiriman() {
        System.out.println("Jenis Pengiriman = Pickup");
        System.out.println("Biaya Tambahan = Rp. -");
    }
}
