package com.kowatschpaul.ue9;

import java.util.List;

public class Student {
    private String firstName, surName, matNr;

    private String[] lectures;
    private int[] ects;

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getSurName() {
        return this.surName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
    public String getMatNr(){
        return this.matNr;
    }
    public void setMatNr(String matNr){
        this.matNr = matNr;
    }
    public String[] getLectures(){
        return this.lectures;
    }
    public void setLectures(String[] lectures){
        this.lectures = new String[lectures.length];
        System.arraycopy(lectures, 0, this.lectures, 0, lectures.length);
    }
    public int[] getEcts(){
        return this.ects;
    }
    public void setEcts(int[] ects){
        this.ects = new int[ects.length];
        System.arraycopy(ects, 0, this.ects, 0, ects.length);
    }

    public Student(){

    }
    public Student(String firstName, String surName, String matNr){
        this.firstName = firstName;
        this.surName = surName;
        this.matNr = matNr;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.firstName).append(", ").append(this.surName).append("\n");
        sb.append("MatNr: ").append(this.matNr).append("\n");
        if(this.lectures != null && this.lectures.length != 0 && this.ects != null && this.ects.length != 0) {
            sb.append("Lectures: \n");
            for (int i = 0; i < this.lectures.length; i++) {
                sb.append("-").append(this.lectures[i]).append(": ").append("(").append(this.ects[i]).append(")").append("\n");
            }
        }
        return sb.toString();
    }

    public int getSumECTS(){
        if(this.ects == null || this.ects.length == 0)
            return 0;
        else{
            int sum = 0;
            for(int i = 0; i < this.ects.length; i++){
                sum += this.ects[i];
            }
            return sum;
        }
    }

}
