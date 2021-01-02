package com.example.binusezfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        TextView tvSaldo = findViewById(R.id.saldo);
        tvSaldo.setText("Saldo = " + TopUpActivity.saldo);
    }

    public void onDrinkButton(View view) {
        Intent intent = new Intent(this, Drinks.class);
        startActivity(intent);

    }

    public void onFoodButton(View view) {
        Intent intent = new Intent(this, Foods.class);
        startActivity(intent);

    }

    public void onMyOrderBtn(View view) {
        Intent intent = new Intent(this, MyOrder.class);
        startActivity(intent);
    }

    public void onMapBtn(View view) {
        //Intent intent = new Intent(this, MapsActivity.class);
        //startActivity(intent);
    }

    public void onHistoryBtn(View view) {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }

    public void  onTopUpBtn(View view) {
        Intent intent = new Intent(this, TopUpActivity.class);
        startActivity(intent);
    }
}