public class Samosval extends Gruzovaya{
    private String samosval;
    public Samosval(int god, String model, int ls, String razmer, int gruz,String samosval) {
        super(god, model, ls, razmer, gruz);
        this.samosval=samosval;
    }

    @Override
    public String toString() {
        return super.toString()+" "+samosval;
    }

    public String getSamosval() {
        return samosval;
    }
}
