package Factory;

public class PegawaiFactory {

    public rulePegawai getRule(String rulePegawai){
        if(rulePegawai == null){
            return null;
        }
        if(rulePegawai.equalsIgnoreCase("KASIR")){
            return new kasir();

        } else if(rulePegawai.equalsIgnoreCase("PELAYAN")){
            return new waiters();
        }

        return null;
    }
}
