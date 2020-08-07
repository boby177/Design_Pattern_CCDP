package Prototype;

public class MetodePenyajianDemo {
    public static void main(String[] args){
        Penyajian penyajian = new Penyajian("(PANAS / DINGIN)");

        System.out.println("Kopi Senja "+penyajian.getPilihPenyajian());

        Penyajian penyajian2 = penyajian.clone();
        System.out.println("Teh Dingin "+penyajian2.getPilihPenyajian());


    }
}
