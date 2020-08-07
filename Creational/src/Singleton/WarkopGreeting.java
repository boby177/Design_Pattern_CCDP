package Singleton;

public class WarkopGreeting {
    private static WarkopGreeting warkop;



    private WarkopGreeting()
    {
        System.out.println("Selamat Datang di Warkop jojo bizarre adventure");
        System.out.println("Menu:");

    }

    public static synchronized WarkopGreeting getWarkop(){
        if(warkop==null){
            warkop=new WarkopGreeting();
        }

        return warkop;
    }

    public void Menu(String menu)
    {
        System.out.println(menu);
    }
}

