import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<KaryawanMemento> ListPegawai = new ArrayList<KaryawanMemento>();

    public void add(KaryawanMemento emp){
        ListPegawai.add(emp);
    }

    public KaryawanMemento get(int index){
        return ListPegawai.get(index);
    }

}