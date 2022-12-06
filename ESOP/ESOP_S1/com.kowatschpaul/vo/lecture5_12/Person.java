package com.kowatschpaul.vo.lecture5_12;

public class Person {
    String firstname = "--";
    String lastname =  "--";
    boolean isStudent = false;

    public Person(String first, String lastname){
        firstname = first;
        this.lastname =  lastname;
        System.out.print("Aufruf beim Erzeugen von Person mit: ");
        this.printName();
    }

    public boolean isEqual(Person other){
        return this.firstname.equals(other.firstname) && this.lastname.equals(other.lastname);
    }

    public void printName(){
        System.out.println(this.firstname + " " + this.lastname);
    }
}
