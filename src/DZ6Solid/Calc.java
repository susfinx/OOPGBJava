package DZ6Solid;

public class Calc {
    private String vvod;

    public Calc(String vvod) {
        this.vvod = vvod;
    }

    public void setVvod(String vvod) {
        this.vvod = vvod;
    }

    public Double result(){
        Double result=0.0;
        String[] num=null;
        if (vvod.contains("/")){
            num=vvod.split("/");

            result=Double.parseDouble(num[0].toString())/Double.parseDouble(num[1].toString());
        }
        if (vvod.contains("*")){
            num=vvod.split("*");
            result=Double.parseDouble(num[0].toString())*Double.parseDouble(num[1].toString());
        }
        if (vvod.contains("+")){
            num=vvod.split("+");
            result=Double.parseDouble(num[0].toString())+Double.parseDouble(num[1].toString());
        }
        if (vvod.contains("-")){
            num=vvod.split("-");
            result=Double.parseDouble(num[0].toString())-Double.parseDouble(num[1].toString());
        }

        return result;
    }
}
