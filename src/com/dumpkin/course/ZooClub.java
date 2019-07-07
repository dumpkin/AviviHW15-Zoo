package com.dumpkin.course;

import java.util.*;


public class ZooClub {
    private ArrayList<Pet> pets;
    private Map<Person, List<Pet>> account;
    private Set<Map.Entry<Person, List<Pet>>> acountSet;
    private Iterator<Map.Entry<Person, List<Pet>>> entryIterator;

    public ZooClub(Person person, ArrayList<Pet> inPets) {
        account = new HashMap<Person, List<Pet>>();
        account.putIfAbsent(person, inPets);
        acountSet = account.entrySet();
        entryIterator = acountSet.iterator();
    }

    public String viewAccouts() {
        StringBuilder out = new StringBuilder();
        ArrayList<Pet> elements = new ArrayList<>();
        int count = 1;
        for (Map.Entry<Person, List<Pet>> listEntry : account.entrySet()) {

            out.append("\nаккаунт #" + count + "\n");
            out.append(listEntry.getKey());
            for (Pet element : listEntry.getValue()) {
                out.append(element + "\n");
            }
            count++;
        }
        return out.toString();
    }

    public void addToAccount(Person person, List<Pet> inPets) {
        account.put(person, inPets);
    }
}
