package com.kowatschpaul.ue9.exc9;

public class CinemaHall {
    private int capacity, visitorCounter;

    public int addVisitors(int amount){
        if(capacity < amount){
            visitorCounter += capacity;
            amount -= capacity;
            capacity -= capacity;
            return amount;
        }
        else{
            visitorCounter += amount;
            capacity -= amount;
            return 0;
        }
    }
    public int getVisitors(){
        return visitorCounter;
    }

    public CinemaHall(){
        capacity = 200;
        visitorCounter = 0;
    }
}
