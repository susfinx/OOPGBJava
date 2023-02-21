public class Urok3Nasled {
    public static void main(String[] args){
        Transport mashina = new Transport(1221,"vse",00,"vse");
        Gruzovaya gruz=new Gruzovaya(2019,"Zil",115,"Gruzovaya",15);
        Legkovaya leg=new Legkovaya(2021,"volga",115,"Legkovaya",5);
        Samosval sam=new Samosval(1988,"Gaz",250,"Gruzovaya",15,"Samosval");
        System.out.println(mashina.getGod());
        System.out.println(gruz.getModel());
        System.out.println(leg.getMesta());
        System.out.println(sam.getSamosval());
    }
}
