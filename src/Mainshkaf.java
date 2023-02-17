public class Mainshkaf {
    public static void main(String[] args){
        Shkaf shkaf=new Shkaf(0);
        shkaf.add(new Kniga(1857,"Pushkin","Dub","Detektiv"));
        shkaf.add(new Kniga(1857,"yuk","ert","Dramma"));
        shkaf.add(new Kniga(1857,"sdrg","fgh","Detektiv"));
        shkaf.add(new Kniga(1857,"dg","ik","Dramma"));
        shkaf.add(new Kniga(1857,"uil","Dub","Komedia"));
        System.out.println(shkaf.getCount());
        shkaf.SearchBookName("Dub");
        shkaf.SearchBookJanr("Detektiv");
    }
}
