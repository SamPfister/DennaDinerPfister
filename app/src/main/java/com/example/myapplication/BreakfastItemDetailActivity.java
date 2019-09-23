package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BreakfastItemDetailActivity extends AppCompatActivity {
    public static final String EXTRA_FOOD_ID = "food choice";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_item_detail);

        Intent intent = getIntent();
        int foodID = intent.getIntExtra(EXTRA_FOOD_ID, 0);
        Food myFood = Food.breakfastFoods[foodID];

        ImageView photo = (ImageView) findViewById(R.id.foodPic);
        TextView name = (TextView) findViewById(R.id.foodName);
        TextView desc = (TextView) findViewById(R.id.foodDesc);
        TextView price = (TextView) findViewById(R.id.foodPrice);

        photo.setImageResource(myFood.getImgResID());
        name.setText(myFood.getFoodName());
        desc.setText(myFood.getFoodDesc());
        price.setText("$" +myFood.getFoodPrice());
    }

}
