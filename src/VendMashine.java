import java.util.ArrayList;
import java.util.List;

public class VendMashine {
    private int maxmashin;
    private List<Product> list = new ArrayList<>();


    public VendMashine(int maxmashin, List<Product> list) {
        this.maxmashin = maxmashin;
        this.list = list;
    }

    public VendMashine(int maxmashin) {
        this.maxmashin = maxmashin;
    }

    public void add(Product product) {
        if(list.size()<maxmashin){
            list.add(product);
        }else {
            System.out.println("Net mesta v mashine");
        }
    }

    @Override
    public String toString() {
        return "VendMashine{" +
                "maxmashin=" + maxmashin +
                ", list=" + list + '}';

    }

    public void getProduktName (String nameProd) {
        boolean flag=false;
        for(Product product:list){
            if(nameProd.equals(product.getName())){
                product.countprod--;
                System.out.println(nameProd+" VYDAN, v nalichii "+product.countprod);
                flag=true;
                if (product.countprod<=0){
                    list.remove(product);
                }
            }
        }
        if (flag==false){
            System.out.println("Net Takogo produkta");
        }
    }
    public void getProduktPrice (Double priceProd) {
        boolean flag=false;
        for(Product product:list){
            if( priceProd == product.getPrice()){
                product.countprod--;
                System.out.println(product.getName()+" Po Cene "+ product.getPrice()+" VYDAN, v nalichii ostalos "
                        +product.countprod);
                flag=true;
                if (product.countprod<=0){
                    list.remove(product);
                }
            }
        }
        if (flag==false){
            System.out.println("Net Takogo produkta");
        }
    }

}