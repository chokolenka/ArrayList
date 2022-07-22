import java.util.ArrayList;
import java.util.Iterator;

public class Country {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();// создаем пустую кооллекцию
        al.add("Argentina");// добавляем пять стран
        al.add("Bulgaria");// начальнй индекс равен 0
        al.add("Canada");
        al.add("Denmark");
        al.add("Narnia");
        System.out.println("Collection:" + al);
        System.out.println("Collection's size:" + al.size());
        System.out.println(al.get(1));// вернет второй элемент коллекции (Bulgaria)
        if (!al.contains ("England")) {
            System.out.println("England is not in collection");
            al.set(4, "England");// метод для добавления ! изменяет только существующие элементы
            System.out.println("Collection:" + al);
            System.out.println("Collection's size:" + al.size());
            System.out.println(al.indexOf("England"));
            int ie = al.indexOf("England");
            al.set(ie, "United Kindom");// переименовали по индексу
            System.out.println("Collection:" + al);
            System.out.println("Collection's size:" + al.size());
            System.out.println("\nCollection Using for Loop:");
            // перебор коллекции с помощью итератора позволяет удалять элементы коллекции
            for (int i=0; i<al.size(); i++){
                System.out.println(al.get(i));
            }
            System.out.println("\nCollection Using While Loop:");
            int i=0;
            while (i<al.size()){
                System.out.println(al.get(2));
                i++;
            }
            System.out.println("\nCollection Using Advanced For Loop:");
            for (Object a : al) {
                System.out.println(a);
            }
            System.out.println("\nCollection Using Iterator");
            Iterator<String> iter = al.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
            al.trimToSize();// этот метод приведет к усечению емкости коллекции до текущего количества элементов
            al.ensureCapacity(100);// этот метод установит емкость коллекции в требуемое значение
        }
    }
}