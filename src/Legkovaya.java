public class Legkovaya extends Transport {
    private int mesta;

    public Legkovaya(int god, String model, int ls, String razmer,int mesta) {
        super(god, model, ls, razmer);
        this.mesta=mesta;
    }

    @Override
    public String toString() {
        return super.toString()+
                "mesta=" + mesta;
    }

    public int getMesta() {
        return mesta;
    }

    public void setMesta(int mesta) {
        this.mesta = mesta;
    }
}
