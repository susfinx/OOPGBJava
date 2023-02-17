import java.util.ArrayList;
import java.util.List;

public class Kniga {
    private int god;
    private String avtor;
    private String name;
    private String janr;

    public Kniga(int god, String avtor, String name, String janr) {
        this.god = god;
        this.avtor = avtor;
        this.name = name;
        this.janr = janr;
    }

    public int getGod() {
        return god;
    }

    public String getAvtor() {
        return avtor;
    }

    public String getName() {
        return name;
    }

    public String getJanr() {
        return janr;
    }

    @Override
    public String toString() {
        return "Kniga{" +
                "god=" + god +
                ", avtor='" + avtor + '\'' +
                ", name='" + name + '\'' +
                ", janr='" + janr + '\'' +
                '}';
    }
}
