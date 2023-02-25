import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.logging.SimpleFormatter;

public class Kalendar{
    private Date day;
    private List<Zadachi> list = new ArrayList<>();
    public Kalendar() {
        this.day = day;
        this.list=list;
    }

    @Override
    public String toString() {
        return "Kalendar{" +
                "day=" + day +
                ", list=" + list +
                '}';
    }

    public Date getDay() {
        return day;
    }

    public List<Zadachi> getList() {
        return list;
    }


    public void showdate(){
        System.out.println(day);
    }
    public void setdeal (Zadachi zadachi){
        list.add(zadachi);
        Scanner scanner = new Scanner(System.in);
        String natiftex="";

        if(zadachi.isNatific()==true){
            String notifdate="";
            System.out.println("Zapishite datu Napominaniya");
            notifdate=scanner.next();
            zadachi.setNatifdate(notifdate);
            System.out.println("Text Napominaniya");
            natiftex=scanner.next();
            zadachi.setNotiftex(natiftex);
        }
    }

}
