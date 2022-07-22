import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Numbers {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();// создали коллекцию
        ll.add ("one");// добавили цифры
        ll.add ("two");
        ll.add ("three");
        ll.add ("four");
        ll.add ("five");
        System.out.println("List:"+ll);
        ll.addLast("six");// метод для добавления элемента в конец списка
        ll.add(3,"three");// метод для добавления элемента по индексу
        ll.addFirst( "zero");// метод для добавления элемента в начало списка
        System.out.println("List:"+ll);
        ll.remove("three");// этот метод удаляет элемент по значению элемента
        System.out.println("List:"+ll);
        ll.remove(5);// этот метод удаляет элемент по индексу
        System.out.println("List:"+ll);
        System.out.println("Loop for:");// перебираем список в обычном цикле
        for (int i=0; i<ll.size(); i++) {
            System.out.println(ll.get(i));
        }
        ListIterator<String> it_beg = ll.listIterator();// после создания итератора он будет указывать
        System.out.println("Loop forward:");// на первый элемент списка
        while (it_beg.hasNext());
        {
            System.out.println(it_beg.next());
        }
        System.out.println("Loop backward:");
        while (it_beg.hasPrevious());
        {
            System.out.println(it_beg.previous());
        }
        ListIterator<String> it_ind = ll.listIterator();//после создания итератора он будет указывать
        System.out.println("Loop from index:");//на произвольный элемент списка по индексу
        while (it_ind.hasNext());
        {
            System.out.println(it_ind.next());
        }
        Iterator<String> it_desc = ll.descendingIterator(); // для перебирания коллекции с конца списка можно создать итератор,
        System.out.println("Loop with descending Iterator");// указывающий на последний элемент списка
        while (it_desc.hasNext());
        {
            System.out.println(it_desc.next());

        }
        it_ind.set("6");
        it_ind.add("7");

        Collections.sort(ll);// сортирует коллекцию в лексикографическом порядке
        System.out.println("Sorted list");
        for (String s:ll)
        {
        System.out.println(s);
        }
    }
        }


