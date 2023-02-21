public class Gruzovaya extends Transport{
    private int gruz;
    public Gruzovaya(int god, String model, int ls, String razmer, int gruz) {
        super(god, model, ls, razmer);
    }

    @Override
    public String toString() {
        return super.toString()+" "+gruz;
    }

    public int getGruz() {
        return gruz;
    }
}
