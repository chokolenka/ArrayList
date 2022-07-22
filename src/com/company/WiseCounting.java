package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class WiseCounting {
    public static void main(String[] args) {
        // делаем после 31
        Emperor person = new Emperor ("Akbar");
        ArrayList<Courtier> courtiers = new ArrayList<>();
        courtiers.add(new Courtier("courtier 1"));
        courtiers.add(new Courtier("courtier 2"));
        courtiers.add(new Courtier("courtier 3"));
        Birbal birbal= new Birbal("Birbal");

        person .asks (0);

        /*for (int i=0; i<courtiers.size(); i++)
        courtiers.get(i).thinks();
        for (Courtier courtier:courtiers)
            courtier.thinks();
        // для текущего (объекта из коллекции) придворного из
        // коллекции придворных вызвать (метод) "думать"
        */
        courtiers.forEach(Courtier::thinks);
        birbal.enters();
        birbal.asks();
        person.asks(0);
        birbal.replies();
        birbal.says();
    }
}
class Person{
    // final один раз задали и менять не можем
    private final String name;
    // мы задаем имя персонажа и объект запоминает имя
    // конструктор которому мы присвоим имя
    public Person (String name){
        this.name = name;
    }

    public String getName() {
        return name;
        // это getter так как имя private (1.имя не читается, 2.может только читаться,
        //3.может только писаться, 4.читаться и писаться
        // not r,r,w,rw
    }

}
// дочерние класс
class Emperor extends Person{
    // расширяет (extends)
    private final LinkedList<String> questions;
    public Emperor (String name){
        super(name);
        questions = new LinkedList<>();
//ключевое слово super вызывает конструктор класса Person  т.е. вместо super Emperor
        // список отличается угловыми скобками, куда помещается текст <>
        questions.add ("How many crows are in this city?");
        questions.add ("How can you be sure?");
    }
    public void looks(){
        System.out.println(getName()+"glanced at his courtiers");
    }

    public void asks (int number){
        System.out.println(getName()+  " asks: " +questions.get(number));
        // у коллекции есть метод get по которому можно получить любое из коллекции

    }
}
// создали императора, дали ему имя, наполнили ему мозг, умел грозно смотреть

class Courtier extends Person {

    public Courtier(String name) {
        super(name);
    }

    public void thinks(){
        System.out.println("Head of the "+getName()+" began to hang low");
    }
}

class Birbal extends Person{

    public Birbal(String name) {
        super(name);
    }

    public void enters(){
        System.out.println(getName()+" enter the courtyard");
    }

    public void asks(){
        System.out.println(getName()+" asks: "+"May I know the question?");
    }

    public void replies(){
        System.out.println(getName()+" replies: There are 50589 crows");
    }

    public void says(){
        System.out.println(getName()+" Make you men count, My lord. If you find more \n" +
                "crows it means some have come to visit their relatives here. \n" +
                "If you find less number of crows it means some have gone to \n" +
                "visit their relatives elsewhere");
    }
}

