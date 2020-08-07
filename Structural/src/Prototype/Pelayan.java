public class Pelayan {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pelayan(String name){
        this.name = name;
    }

    public void announce(String message){
        Message.showMessage(this,message);
    }
}