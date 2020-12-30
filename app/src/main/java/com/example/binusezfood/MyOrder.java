package com.example.binusezfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MyOrder extends AppCompatActivity {
    public static int air = 0;
    public static int pukat = 0;
    public static int mangga = 0;

    TextView totalTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        this.setTitle("BinusEZFoody: My Order");
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        totalTxt = findViewById(R.id.totalText);
        totalTxt.setText("Total: RP " + hitungTotal());
    }

    int hitungTotal(){
        return (air*1000 + pukat*5000 + mangga*5000);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void onPay(View view){
        Toast.makeText(getBaseContext(), "Order Complete", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, OrderComplete.class);
        startActivity(intent);
    }
}