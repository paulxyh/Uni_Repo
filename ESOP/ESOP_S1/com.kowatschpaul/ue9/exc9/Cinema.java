package com.kowatschpaul.ue9.exc9;

public class Cinema {
    private CinemaHall[] cinemaHalls;
    public Cinema(int halls){
        cinemaHalls = new CinemaHall[halls];
        for(int i = 0; i < cinemaHalls.length; i++){
            cinemaHalls[i] = new CinemaHall();
        }
    }

    public int getSumVisitors(){
        int visitors = 0;
        for(int i = 0; i < cinemaHalls.length; i++){
            visitors += cinemaHalls[i].getVisitors();
        }
        return visitors;
    }
    public int addVisitors(int hall, int amount){
        if(hall >= 0 && hall < cinemaHalls.length) {
            return cinemaHalls[hall].addVisitors(amount);
        }
        else{
            System.out.println("ERROR: Invalid cinema hall ID.");
            return -1;
        }
    }

}
