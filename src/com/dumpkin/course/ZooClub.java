package com.dumpkin.course;

import java.util.*;


public class ZooClub {
    private ArrayList<Pet> pets;
    private Map<Person, List<Pet>> account;
    private Set<Map.Entry<Person, List<Pet>>> set;
    // private Iterator<Map.Entry<Person, List<Pet>>> iter;

    public ZooClub(Person person, ArrayList<Pet> inPets) {

        account = new HashMap<>();
        account.put(person, inPets);

    }

    public String viewAccouts() {
        StringBuilder out= new StringBuilder("аккаунт \n");
        ArrayList<Pet> elements=new ArrayList<>();

        for (Map.Entry<Person, List<Pet>> listEntry : account.entrySet()) {
            out.append(listEntry.getKey());

            for (Pet element : listEntry.getValue()) {

                out.append(element+"\n");
            }
        }

        return out.toString();
    }

    public void addToAccount(Person person, List<Pet> inPets) {
        account.put(person, inPets);
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "account=" + account +
                '}';
    }
}
