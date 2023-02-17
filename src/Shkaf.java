import java.util.ArrayList;
import java.util.List;

public class Shkaf {
    private int count;
    private List<Kniga> list = new ArrayList<>();

    public Shkaf(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public List<Kniga> getList() {
        return list;
    }
    public void add (Kniga kniga){
        list.add(kniga);
        count++;
    }

    @Override
    public String toString() {
        return "Shkaf{" +
                "count=" + count +
                ", list=" + list +
                '}';
    }

    public void SearchBookName (String name){
        boolean flag=false;
        for (Kniga kniga:list){
            if (name.equals(kniga.getName())){
                System.out.println("Est takaya kniga");
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("Net takoy kniga");
        }
    }
    public void SearchBookJanr (String janr){
        boolean flag=false;
        for (Kniga kniga:list){
            if (janr.equals(kniga.getJanr())){
                System.out.println("Est kniga "+kniga.getName());
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("Net takoy kniga");
        }
    }
}
