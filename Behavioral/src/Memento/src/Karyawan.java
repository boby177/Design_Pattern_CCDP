public class Karyawan {

    int id;
    String name;

    public Karyawan(int id, String name) {
        super();
        this.id = id;
        this.name = name;
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

    public KaryawanMemento createMemento() {
        return new KaryawanMemento(this);
    }

    public void restoreToMemento(KaryawanMemento memento) {
        this.id = memento.getId();
        this.name = memento.getName();
    }

    public void printEmp(){
        String string1 = "ID Karyawan= "+this.id+ ", Nama Karyawan = "+this.name;
        System.out.println(string1);
    }
}