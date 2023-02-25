//Должен быть класс Задачи (общий/родительский и подтипы)
// У задачи должно быть длительность, дедлайн, приоритет, тема, ответсвенный... - параметры на Ваше
// усмотрение
// **У задачи должна быть возможность включить или выключить нотификацию на разные события, например,
// приближение дедлайна.
public abstract class Zadachi{
    private String startdeal;  //Nachalo zadachi
    private String stopdeal;   // dedlayn
    private boolean prioritet;
    private String tema;
    private boolean natific;
    private String natifdate=null;
    private String notiftex;


    public Zadachi(String startdeal, String stopdeal, boolean prioritet, String tema, boolean natific) {
        this.startdeal = startdeal;
        this.stopdeal = stopdeal;
        this.prioritet = prioritet;
        this.tema = tema;
        this.natific=natific;
        this.natifdate=natifdate;
        this.notiftex=notiftex;

    }

    @Override
    public String toString() {
        return "Zadachi{" +
                "startdeal=" + startdeal +
                ", stopdeal=" + stopdeal +
                ", prioritet=" + prioritet +
                ", tema='" + tema + '\'' +
                ", natific=" + natific +
                ", natifdate"+natifdate+
                ", notiftex"+notiftex+
                '}';
    }

    public String getNotiftex() {
        return notiftex;
    }

    public void setNotiftex(String notiftex) {
        this.notiftex = notiftex;
    }

    public String getStartdeal() {
        return startdeal;
    }

    public void setStartdeal(String startdeal) {
        this.startdeal = startdeal;
    }

    public String getStopdeal() {
        return stopdeal;
    }

    public void setStopdeal(String stopdeal) {
        this.stopdeal = stopdeal;
    }

    public boolean isPrioritet() {
        return prioritet;
    }

    public void setPrioritet(boolean prioritet) {
        this.prioritet = prioritet;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public boolean isNatific() {
        return natific;
    }

    public void setNatific(boolean natific) {
        this.natific = natific;
    }

    public String getNatifdate() {
        return natifdate;
    }

    public void setNatifdate(String natifdate) {
        this.natifdate = natifdate;
    }
}
