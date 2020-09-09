package Belajar_SOLID_10_Single_Responsiblity_Principle.Java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    int id;
    String name;
    String date;

    public Main(int id,String name,String date){
        this.date = date;
        this.id = id;
        this.name = name;
    }

    void addToStore(){
        if(!FoodExpiry.isExpired(date)){
            // Add to Store
        }
    }
}

class FoodExpiry{

    public static boolean isExpired(String date){
        Date foodDate = new Date();
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
        try {
            foodDate = dateFormat.parse(date);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return foodDate.getTime() >= now.getTime();
    }
}