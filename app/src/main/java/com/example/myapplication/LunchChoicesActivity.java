package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LunchChoicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_choices);
        // an ArrayAdapter connects an ArrayList to a List
        ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Food.lunchFoods);
        ListView listFoods = (ListView) findViewById(R.id.lunchChoices);
        listFoods.setAdapter(listAdapter);

        //create a listener to listen for when a food item is clicked on
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(LunchChoicesActivity.this, LunchItemDetailActivity.class);
                intent.putExtra(LunchItemDetailActivity.EXTRA_FOOD_ID, (int) id);
                startActivity(intent);
            }
        };
        listFoods.setOnItemClickListener(itemClickListener);
    }
}
