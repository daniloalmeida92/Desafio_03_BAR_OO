package entities;

public class Bill {

    public static char gender;

    public static int beer;
    public static int barbecue;
    public static int softDrink;

    public static double ticket(){
        if (gender == 'M'){
             return 10.00;
        } else {
            return  8.00;
        }
    }

    public static double feeding(){
         return (beer * 5.00) + (barbecue * 7.00) + (softDrink * 3.00);
    }

    public static double total(){
        return feeding() + ticket();
    }

    public static double cover(){
        if (total() > 30){
            return  0;
        } else {
        return 4;
        }
    }



}
