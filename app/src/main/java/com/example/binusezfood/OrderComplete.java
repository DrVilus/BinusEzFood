package com.example.binusezfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderComplete extends AppCompatActivity {
    TextView totalText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_complete);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        this.setTitle("BinusEZFoody: Order Complete");
        setSupportActionBar(myToolbar);

        totalText = findViewById(R.id.totalText);
        totalText.setText("Total: RP " + hitungTotal());
    }

    int hitungTotal(){
        return (MyOrder.air*1000 + MyOrder.pukat*5000 + MyOrder.mangga*5000);
    }

    public void onMenuBtn(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}