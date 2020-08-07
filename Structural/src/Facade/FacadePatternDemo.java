package Facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        PromoMaker promoMaker = new PromoMaker();

        promoMaker.tampilWeekday();
        promoMaker.tampilWeekend();
    }
}
