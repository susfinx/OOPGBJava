public class Urok1 {
    public static void main(String[] args){
        Car car = new Car("BMW",2021,3000000,"Black",250, 2018,"Legkovoy", 4);
        Car carGuz= new Car("Gaz",1998,250000,"Blue",250,2021,"Gruzovoy", 2);
        Car car2= new Car("Mersedes", 2022,3500000, "Whait",300,2021,"Legkovoy",4);
//        car.getinfo();
//        car.posadka();
//        car.CarStart();
//        car.road("Baumana");
//        car.carStop();
//        car.vysadka();
//        car.CarStart();
//        car.road("solovyeva");
//        car.carStop();
//        car.posadka();
//        car.CarStart();
//        car.road("Vatunina");
//        car.carStop();
//        car.vysadka();

//        carGuz.getinfo();
//        carGuz.zagruz();
//        carGuz.CarStart();
//        carGuz.road("Ovoshnaya Baza");
//        carGuz.carStop();
//        carGuz.razgruz();
//        carGuz.CarStart();
//        carGuz.road("fruktovaya Baza");
//        carGuz.carStop();
//        carGuz.zagruz();
//        carGuz.CarStart();
//        carGuz.road("Domoy");
//        carGuz.carStop();
//        carGuz.razgruz();
        finish (car.speed(),car2.speed(),45);
    }
    static void finish (Double car, Double car2, int trassa){
        System.out.println("Trassa ="+" "+trassa+" "+"km");
        double t1= trassa/car;
        double t2= trassa/car2;
        if (t1<t2){
            System.out.println("Pobeditel car ego vremya"+" "+t1);
        }
        else {System.out.println("Pobeditel car2 ego vremya"+" "+t2);}
    }
}
