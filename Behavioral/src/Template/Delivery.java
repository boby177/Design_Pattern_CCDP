package Template;

public class Delivery extends Pengiriman {

    @Override
    public void biayapengiriman() {
        System.out.println("Jenis Pengiriman = Delivery");
        System.out.println("Biaya Tambahan = Rp. 5000");

    }
}

