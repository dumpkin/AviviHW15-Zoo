package com.dumpkin.course;

public class Person {
  private   String namePerson;
   private String adress;

    public Person(String namePerson, String adress) {
        this.namePerson = namePerson;
        this.adress = adress;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
