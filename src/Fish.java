import java.util.Comparator;
import java.util.TreeSet;

public class Fish {// класс
    public static void main(String[] args) {
        TreeSet<Fish> fishes = new TreeSet<>(new FishComparator());// создаем коллекцию из объектов
        fishes.add(new Fish("eel", 1.5, 120));
        fishes.add(new Fish("salmon", 2.5, 180));
        fishes.add(new Fish("carp", 3.5, 80));
        fishes.add(new Fish("trout", 2.2, 150));
        fishes.add(new Fish("trout", 2.8, 150));
        System.out.println("Collection:" + fishes);
        System.out.println("Collection's size:" + fishes.size());
    }
    private String name;
    private double weight;
    private double price;

    public Fish(String name, double weight, double price) {
        this.name = name;// получаем объект
        this.weight = weight;// ...
        this.price = price;// ...
    }
    // hashCode() создал  для двух ОДИНАКОВЫХ объектов разные хэш коды,так как адреса у этих объектов разные
    // поэтому переопределим в классе Fish метод hashCode() и метод equals() - ПЕРЕОПРЕДЕЛЕНИЕ

            public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Fish)) {
                return false;
            }
            Fish tmp = (Fish) o;
            return (tmp.name.equals(this.name) &&
                    tmp.weight == this.weight &&
                    tmp.price == (this.price));
        }

        public int HashCode() {
            int code = 17;
            code = 31 * code + this.name.hashCode();
            code = 31 * code + (int) this.weight;
            code = 31 * code + (int) this.price;
            return code;
        }

    public double getWeight()
    {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name + " weight:" + this.weight +
                " price:" + this.price;
    }
    public static class FishComparator implements Comparator<Fish>
    {
        @Override
        public int compare(Fish o1, Fish o2) {// рыбки сортируются по весу
            return (int) (o1.getWeight() * 100 - o2.getWeight() * 100);
        }
    }
}
