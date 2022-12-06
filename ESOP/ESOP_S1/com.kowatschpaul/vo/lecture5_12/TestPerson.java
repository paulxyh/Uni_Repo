package com.kowatschpaul.vo.lecture5_12;
import com.kowatschpaul.vo.lecture5_12.Person;


public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Paul", "Kowatsch");

        Person p2 = new Person("Eva", "Moser");
        p1.firstname = "Max";
        p1.printName();
        p2.printName();

        if(p1.isEqual(p2))
            System.out.println("Gleich");
        else
            System.out.println("Ungleich");


        System.out.println("Adresse: " + p1);
        System.out.println("Adresse: " + p2);

    }
}
