package com.dumpkin.course;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * 2)Створити клас Зооклуб , як поля прописати в ньому List, Map, Set, Iterator.(
     * List<Pet> list;
     * Map<Person, List<Pet>> map;
     * Set<Entry<Person, List<Pet>>> set;
     * Iterator<Entry<Person, List<Pet>>> iter;)
     * Провести ініціалізацію даних полів в конструкторі класу Зооклуб.*/

    public static void main(String[] args) {
        System.out.println("ЗООКЛУБ\n\n");

        ArrayList<Pet> pets=new ArrayList<>();
        pets.add(new Pet("Бобік","собака"));
        pets.add(new Pet("Кєша","папуга"));
        Person person=new Person("Іван Петренко","вул.Шевчкенка,15");

        ZooClub club=new ZooClub(person,pets);

        pets.clear();
        person.setNamePerson("Сергій Вернигора");
        person.setAdress("вул.Центральна,43");
        pets.add(new Pet("Пегас","кінь"));
        pets.add(new Pet("Анфіса","криса"));
        club.addToAccount(person,pets);

        pets.clear();
        person.setNamePerson("Свирид Опанасович");
        person.setAdress("Будинок із бичачим пузирем");
        pets.add(new Pet("Шарік","песик"));
        pets.add(new Pet("Мурзік","Котик"));
        club.addToAccount(person,pets);

        System.out.println( club.viewAccouts());


    }
}
