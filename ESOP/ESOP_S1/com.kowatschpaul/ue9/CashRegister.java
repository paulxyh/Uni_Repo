package com.kowatschpaul.ue9;

public class CashRegister {
    protected double currentAmount;

    public CashRegister(double startAmount){
        if(startAmount >= 0) {
            System.out.println("Die Kassa ist offen!");
            currentAmount += startAmount;
        }
        else{
            System.out.println("Fehlerhafter Startwert!");
            currentAmount = 0;
        }
    }

    public void printCurrentAmount(){
        System.out.println("Die Kassa beinhaltet " + String.format("%.2f", currentAmount) + " Euro.");
    }
    public double processPayment(double amountToPay, double givenAmount){
        double returnAmount = givenAmount - amountToPay;
        if(returnAmount >= 0){
            currentAmount += amountToPay;
            System.out.println("Der Betrag "
                    + String.format("%.2f", amountToPay)
                    + " Euro wurde mit "
                    + String.format("%.2f", givenAmount)
                    + " Euro bezahlt. Wechselgeld = "
                    + String.format("%.2f", returnAmount)
                    + " Euro.");
            return returnAmount;
        }
        else{
            System.out.println("Fehler! Der gegebene Betrag ist zu gering. "
                    + String.format("(%.2f < %.2f)", givenAmount, amountToPay));
            return -1;
        }
    }
}
