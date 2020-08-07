package State;

public class PesananDikirimState implements PesananState {

    @Override
    public void SetPesananState(Pesanan pesanan) {
        System.out.println("Pesanan sedang dikirim");
    }
}

