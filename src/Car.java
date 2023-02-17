import java.util.Random;
import java.util.Scanner;

public class Car {
    private String model;
    private int year;
    private double price;
    private String color;
    private int power;
    private boolean status;
    private int maxmest;
    private int mesta;
    private int TO;
    private String razmer;
    private boolean gruz;
    private Double kmh;


    public Car (String model, int year,double price, String color,int power, int TO, String razmer,int maxmest){
        this.model=model;
        this.year=year;
        this.price=price;
        this.color=color;
        this.power=power;
        this.status=false;
        this.razmer=razmer;
        this.gruz=false;
        this.maxmest=maxmest;
        this.mesta=maxmest;
        this.kmh=kmh;

    }
    public void  getinfo(){
        if(razmer=="Legkovoy"){
            System.out.println(model+"\n"+year+"\n"+price+"\n"+color+"\n"+power+"\n"+"Svobodnyh Mest"+" "+mesta);
        }
        if(razmer=="Gruzovoy"){
            System.out.println(model+"\n"+year+"\n"+price+"\n"+color+"\n"+power+"\n"+"Gruz"+" "+gruz);
        }
    }
    public void CarStart (){
        if (status==true){
            System.out.println("Avto Uzhe Zaveden");
        }
        if (status==false){
            status=true;
            System.out.println("Avto Zaveden" );
        }
    }
    public void carStop (){
        if (status==true){
            status=false;
            System.out.println("Avto Ostanovlen");
        }
        if (status==true){
            System.out.println("Avto Nezaveden");
        }
    }
    public void road (String adress){
        if (status==true){
            System.out.println("Poehali po addresu"+" "+adress);
        }
        if (status==false){
//            System.out.println("Avto ne zaveden Zavedite avto");
        }
    }
    public void posadka () {
        Scanner scanner = new Scanner(System.in);
        int otv = 0;
        boolean flag = false;
        if (mesta == 0) {
            System.out.println("Net Svobodnyh Mest");
        }
        while (flag == false) {
            System.out.println("Skolko pasojirov posadit");
            otv = scanner.nextInt();
            if (otv>mesta|otv<0) {
                System.out.println("Nekoreknoe chislo");
                if(otv>mesta){
                    System.out.println("Svobodnyh mest"+" "+mesta);
                }
            }
            else{
                flag=true;
            }
        }
        if(mesta-otv>=0){
            mesta=mesta-otv;
            System.out.println("Svobodnyh mest"+" "+mesta);
        }
    }
    public void vysadka () {
        Scanner scanner = new Scanner(System.in);
        int otv = 0;
        boolean flag = false;
        if (mesta<maxmest){
            while (flag==false){
                System.out.println("Skolko pasojirov vysadit");
                otv = scanner.nextInt();
                if (otv<0|otv>maxmest){
                    System.out.println("Nekoreknoe chislo");
                }
                if (otv>maxmest-mesta){
                    System.out.println("Stolko pasazhirov net");
                }
                else {
                    flag=true;
                }
            }
            if (mesta <=maxmest|mesta>0){
                mesta=mesta+otv;
                System.out.println("Svobodnyh mest"+" "+mesta);
            }
        }
        else {
            System.out.println("Pasazhirov net");
        }
    }
    public void zagruz(){
        if (gruz==false){
            gruz=true;
            System.out.println("Zagruzhen");
        }
        else{System.out.println("Uzhe Zagruzhen");}
    }
    public void razgruz (){
        if(gruz==true){
            gruz=false;
            System.out.println("Pustoy");
        }
    }
    public Double speed(){
        Random random=new Random();
        kmh=random.nextDouble(100,200);
        return kmh;
    }
}
