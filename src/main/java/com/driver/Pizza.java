package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean Cheese;

    private Boolean Topping;

    private Boolean Bag;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.Bag = false;
        this.Cheese = false;
        this.Topping = false;
        if(isVeg) {
            this.setPrice(300);
        }
        else{
            this.setPrice(400);
        }

        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int p){
        this.price=p;
    }
    public void addExtraCheese(){
        // your code goes here
        this.Cheese=true;
    }

    public void addExtraToppings(){
        // your code goes here
        this.Topping=true;
    }

    public void addTakeaway(){
        // your code goes here
        this.Bag=true;
    }

//    Base Price Of The Pizza: 300
//    Extra Cheese Added: 80
//    Extra Toppings Added: 70
//    Paperbag Added: 20
//    Total Price: 470

    public String getBill(){
        // your code goes here
        if(isVeg) {
            bill = "Base Price Of The Pizza: 300" + "\n";
        }
        else {
            bill = "Base Price Of The Pizza: 400" + "\n";
        }
        if(Cheese){
            bill+= "Extra Cheese Added: 80"+"\n";
            price+=80;
        }
        if(Topping){
            if(isVeg) {
                bill += "Extra Toppings Added: 70" + "\n";
                price += 70;
            }
            else{
                bill += "Extra Toppings Added: 120" + "\n";
                price += 120;
            }
        }
        if(Bag){
            bill+="Paperbag Added: 20"+"\n";
            price+=20;
        }
        bill += "Total Price: "+price+"\n";
        return this.bill;
    }
}
