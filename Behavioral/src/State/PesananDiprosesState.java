package State;

public class PesananDiprosesState implements PesananState {

    @Override
    public void SetPesananState(Pesanan pesanan) {
        System.out.println("Pesanan sedang diproses");
    }
}

