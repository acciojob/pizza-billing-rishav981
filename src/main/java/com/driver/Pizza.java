package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean cheese;

    private Boolean Topping;

    private Boolean Bag;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.Bag = false;
        this.cheese = false;
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
<<<<<<< HEAD
        if(!Cheese){
            this.Cheese=true;
            price+=70;
        }
        this.Cheese=true;
=======
        // your code goes here
        this.cheese=true;
>>>>>>> c02371a4aea854faf0df4ed7c61a4575a1ab1d74
    }

    public void addExtraToppings(){
        // your code goes here
        this.Topping=true;
        if(isVeg){
            price+=80;
        }
        else{
            price+=120;
        }
        this.Topping=true;
    }

    public void addTakeaway(){
        if(!Bag){
            this.Bag=true;
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
            bill = "Base Price Of The Pizza: 300" + "\n";
        }
        else {
            bill = "Base Price Of The Pizza: 400" + "\n";
        }
        if(cheese){
            bill+= "Extra Cheese Added: 80"+"\n";
        }
        if(Topping){
            if(isVeg) {
                bill += "Extra Toppings Added: 70" + "\n";
            }
            else{
                bill += "Extra Toppings Added: 120" + "\n";
            }
        }
        if(Bag){
            bill+="Paperbag Added: 20"+"\n";
        }
        bill += "Total Price: "+price+"\n";
        return this.bill;
    }
}
