public class MementoPatternDemo {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        Karyawan pegawai =new Karyawan(10, "Andy Prasetyo");
        pegawai.printEmp();
        careTaker.add(pegawai.createMemento());

        pegawai.setName("Jonathan Prabowo");
        pegawai.printEmp();
        careTaker.add(pegawai.createMemento());

        pegawai.restoreToMemento(careTaker.get(0));
        System.out.println("\nSetelah Diperbaiki:");
        pegawai.printEmp();

    }

}