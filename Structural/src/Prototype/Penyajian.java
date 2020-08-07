public class Penyajian implements Cloneable {

    private String pilihPenyajian;

    public Penyajian(String penyajian){
        setPilihPenyajian(penyajian);
    }

    public Penyajian clone(){
        Penyajian p = null;
        try{
            p = (Penyajian)super.clone();
        }catch(Exception e){

        }
        return p;
    }

    public String getPilihPenyajian() {
        return pilihPenyajian;
    }

    public void setPilihPenyajian(String pilihPenyajian) {
        this.pilihPenyajian = pilihPenyajian;
    }
}