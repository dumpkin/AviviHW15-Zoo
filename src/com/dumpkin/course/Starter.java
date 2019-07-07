package com.dumpkin.course;

import java.util.ArrayList;
import java.util.Scanner;

public class Starter {

    public static void launch() {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Бобік", "собака"));
        pets.add(new Pet("Кєша", "папуга"));
        Person person = new Person("Іван Петренко", "вул.Шевчкенка,15");
        ZooClub club = new ZooClub(person, pets);

//        pets = new ArrayList<>();
//        person = new Person("Сергій Вернигора", "вул.Центральна,43");
//        pets.add(new Pet("Пегас", "кінь"));
//        pets.add(new Pet("Анфіса", "криса"));
//        club.addToAccount(person, pets);

//        pets = new ArrayList<>();
//        person = new Person("Свирид Опанасович", "Будинок із бичачим пузирем");
//        pets.add(new Pet("Шарік", "песик"));
//        pets.add(new Pet("Мурзік", "Котик"));
//        club.addToAccount(person, pets);


        ConsoleInput input = new ConsoleInput();
        Scanner key = new Scanner(System.in);

        System.out.println("(1)показати учасників клубу (2)додати учасника (3)редагувати учасника \n" +
                "(exit)Вийти з програми");
        while (key.hasNext()) {
            switch (key.nextLine()) {

                case "1":
                    System.out.println("\n");
                    System.out.println(club.viewAccouts());
                    System.out.println("(1)показати учасників клубу (2)додати учасника (3)редагувати учасника \n" +
                            "(exit)Вийти з програми");
                    break;
                case "2":
                    addAccount(club);
                    System.out.println("(1)показати учасників клубу (2)додати учасника (3)редагувати учасника \n" +
                                       "(exit)Вийти з програми");
                    break;
                case "3":
//                    TODO removeElementFrom(club);
                    System.out.println("видалити аккаунт");
                    break;
                case "4":
//                    TODO edit account
                    System.out.println("Редагуємо");
                    break;
                default:
                    System.out.println("неправильний параметр. спробуйте ще раз.");
                    System.out.println("(1)показати учасників клубу (2)додати учасника (3)редагувати учасника \n" +
                            "(exit)Вийти з програми");
                case "exit":
                    return;
            }
        }
    }

    public static void addAccount(ZooClub elements) {
        /**
         * вводимо данні елементу
         * */
        ConsoleInput input = new ConsoleInput();
        Scanner key = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        System.out.println("додаємо нового користувача");
        Person person = new Person(input.inputString("П.І.Б.: "), input.inputString("адресу: "));
        System.out.println("(1)додати улюбленця (2)Вийти");
        while (key.hasNext()) {
            switch (key.nextLine()) {

                case "1":
                    pets.add(new Pet(input.inputString("кличку: "), input.inputString("тип тварини: ")));
                    System.out.println("(1)додати улюбленця (2)Вийти");
                    break;
                case "2":
                    elements.addToAccount(person, pets);
                    System.out.println("(1)показати учасників клубу (2)додати учасника (3)редагувати учасника \n" +
                            "(exit)Вийти з програми");
                    return;

            }
        }
        //        pets = new ArrayList<>();
//        person = new Person("Свирид Опанасович", "Будинок із бичачим пузирем");
//        pets.add(new Pet("Шарік", "песик"));
//        pets.add(new Pet("Мурзік", "Котик"));
//        club.addToAccount(person, pets);


//        Commodity element = new Commodity(input.inputString("Бренд"), input.inputString("Назва продукту"),
//                input.inputString("тип"), input.inputString("кінцевий термін придатності"));
//        elements.add(element);

        //System.out.println("_______________________________\n");

    }

}
