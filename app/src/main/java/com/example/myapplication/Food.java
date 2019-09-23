package com.example.myapplication;

public class Food {
    private String foodName;
    private String foodDesc;
    private double foodPrice;
    private int imgResID;

    public Food(String foodName, String foodDesc, double foodPrice, int imgResID){
        this.foodName = foodName;
        this.foodDesc = foodDesc;
        this.foodPrice = foodPrice;
        this.imgResID = imgResID;
    }

    public static final Food[] breakfastFoods ={
            new Food("Eggs", "3 Eggs, some cheese, pepper, and tomatoes", 8.99, R.drawable.omelet),
            new Food("Pancakes", "3 pancakes, choice of meat, potato", 7.95, R.drawable.pancakes),
            new Food("Waffles", "Belgian Waffles, whipped cream, fresh fruit", 7.50, R.drawable.waffles)
    };

    public String toString(){
        return foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getImgResID() {
        return imgResID;
    }

    public void setImgResID(int imgResID) {
        this.imgResID = imgResID;
    }

}
