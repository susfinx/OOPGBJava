package DZ7OOP;

public interface Calkproc {
    default Double proc(String vvod){
        String[] num=vvod.split("%");
        Double proc=(Double.parseDouble(num[0].toString())*Double.parseDouble(num[1].toString()))/100;
        return proc;
    }
}
