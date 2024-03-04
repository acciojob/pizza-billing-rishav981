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
        if(!this.Cheese){
            price+=80;
        }
        this.Cheese=true;
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.Topping) {
            if (isVeg) {
                price += 70;
            } else {
                price += 120;
            }
        }
        this.Topping=true;
    }

    public void addTakeaway(){
        if(!this.Bag){
            price+=20;
        }
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
            this.bill = "Base Price Of The Pizza: 300" + "\n";
        }
        else {
            this.bill = "Base Price Of The Pizza: 400" + "\n";
        }
        if(this.Cheese){
            this.bill+= "Extra Cheese Added: 80"+"\n";
        }
        if(this.Topping){
            if(isVeg) {
                this.bill += "Extra Toppings Added: 70" + "\n";
            }
            else{
                this.bill += "Extra Toppings Added: 120" + "\n";
            }
        }
        if(this.Bag){
            this.bill+="Paperbag Added: 20"+"\n";
        }
        this.bill += "Total Price: "+price+"\n";
        return this.bill;
    }
}
