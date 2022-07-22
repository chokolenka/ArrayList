package com.company;

import java.util.ArrayList;
import java.util.List;

public class PersonsDemo {
    public static void main(String[] args) {
        List<PersonA> persons = new ArrayList<>();
        persons.add(new PersonB("nameA", "surnameA"));
        persons.add(new PersonB("name", "surname"));
        persons.forEach(System.out::println);

        List<PersonA> personsA = new ArrayList<>();

        persons.stream
                        ()
                .filter(p->p.getName().equals("name"))
                .forEach(p->personsA.add((PersonB)p));
        personsA.forEach(System.out::println);
    }
}

class PersonA{
    protected String name;
    protected String surname;

    public PersonA(String name, String surname) {

        this.name
                = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "PersonA{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
    public PersonA(){}
}

class PersonB extends PersonA{
    public PersonB(String name, String surname){
        //super(name, surname)
        super();

        this.name
                = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "PersonB{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

