public class Transport {
    private int god;
    private String model;
    private int ls;
    private String razmer;

    public Transport(int god, String model, int ls, String razmer) {
        this.god = god;
        this.model = model;
        this.ls = ls;
        this.razmer = razmer;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "god=" + god +
                ", model='" + model + '\'' +
                ", ls=" + ls +
                ", razmer='" + razmer + '\'' +
                '}';
    }

    public int getGod() {
        return god;
    }

    public String getModel() {
        return model;
    }

    public int getLs() {
        return ls;
    }

    public String getRazmer() {
        return razmer;
    }
}
