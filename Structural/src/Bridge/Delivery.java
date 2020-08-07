package Bridge;

public class Delivery implements Pengiriman{

    @Override
    public void metodePengiriman() {
        System.out.println("Metode Pengiriman = PickUp");
        System.out.println("Biaya Pengiriman = Rp. 5000");
    }
}
