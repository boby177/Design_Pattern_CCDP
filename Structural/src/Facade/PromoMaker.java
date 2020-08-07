package Facade;

public class PromoMaker {
    private promo weekday;
    private promo weekend;

    public PromoMaker() {
        weekday = new weekday();
        weekend = new weekend();
    }

    public void tampilWeekday(){
        weekday.tampilkan();
    }
    public void tampilWeekend(){
        weekend.tampilkan();
    }
}
