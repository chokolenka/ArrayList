import java.util.TreeSet;

public class Countries {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Georgia");
        ts.add("Argentina");
        ts.add("Ukraine");
        ts.add("Belgium");
        ts.add("Canada");
        System.out.println("Collection:"+ts);
        System.out.println("Collection's size:"+ ts.size());
    }
}
