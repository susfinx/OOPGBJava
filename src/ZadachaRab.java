public class ZadachaRab extends Zadachi {
    private String otvetstvenn;
    public ZadachaRab(String startdeal, String stopdeal, boolean prioritet, String tema,boolean natific, String otvetstvenn) {
        super(startdeal, stopdeal, prioritet, tema, natific);
        this.otvetstvenn=otvetstvenn;
    }

    @Override
    public String toString() {
        return super.toString()+" "+otvetstvenn;
    }

    public String getOtvetstvenn() {
        return otvetstvenn;
    }

    public void setOtvetstvenn(String otvetstvenn) {
        this.otvetstvenn = otvetstvenn;
    }
}
