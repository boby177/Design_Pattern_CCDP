package Factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        PegawaiFactory pegawaiFactory = new PegawaiFactory();
        rulePegawai pegawai1 = pegawaiFactory.getRule("KASIR");
        pegawai1.tampilkan();
        rulePegawai pegawai2 = pegawaiFactory.getRule("PELAYAN");
        pegawai2.tampilkan();
    }
}
