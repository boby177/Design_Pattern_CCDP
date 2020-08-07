public class KaryawanMemento {

    int id;
    String name;

    public KaryawanMemento(Karyawan employee) {
        this.id = employee.id;
        this.name = employee.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}