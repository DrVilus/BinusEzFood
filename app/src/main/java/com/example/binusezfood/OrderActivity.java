package com.example.binusezfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {
    public static int id = 0;
    ImageView img;
    TextView barang, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_order);
        this.setTitle("BinusEZFoody: Order");
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        img = findViewById(R.id.nasgorbtn);
        barang = findViewById(R.id.air1);
        harga = findViewById(R.id.air2);

        if(id==1){
            img.setImageResource(R.drawable.pukat);
            barang.setText("Jus Pukat");
            harga.setText("RP 5000");
        }else if(id==2){
            img.setImageResource(R.drawable.mangga);
            barang.setText("Jus Mangga");
            harga.setText("RP 5000");
        }else if(id==3){
            img.setImageResource(R.drawable.nasgor);
            barang.setText("Nasi Goreng");
            harga.setText("RP 10000");
        }else if(id==4){
            img.setImageResource(R.drawable.miegor);
            barang.setText("Mie Goreng");
            harga.setText("RP 10000");
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    void order(int finalValue){
        if(id==0){
            MyOrder.air += finalValue;
        }else if(id==1){
            MyOrder.pukat += finalValue;
        }else if(id==2){
            MyOrder.mangga += finalValue;
        }else if(id==3){
            MyOrder.nasgor += finalValue;
        }else if(id==4){
            MyOrder.miegor += finalValue;
        }
    }

    public void onMyOrderBtn(View view) {
        Intent intent = new Intent(this, MyOrder.class);
        startActivity(intent);
    }

    public void onOrderBtn(View view) {
        Intent intent = new Intent(this, MyOrder.class);
        EditText quant = findViewById(R.id.quant);
        String value= quant.getText().toString();
        int finalValue;
        if(value.matches("")){
            finalValue = 0;
            Toast.makeText(getBaseContext(), "Quantity must be filled", Toast.LENGTH_SHORT).show();
        }else{
            finalValue=Integer.parseInt(value);
            order(finalValue);
            startActivity(intent);
        }


    }


    public void onOrderMore(View view) {
        Intent intent = null;
        if(id>=3){
            intent = new Intent(this, Foods.class);
        }else{
            intent = new Intent(this, Drinks.class);
        }

        EditText quant = findViewById(R.id.quant);
        String value= quant.getText().toString();
        int finalValue;
        if(value.matches("")){
            Toast.makeText(getBaseContext(), "Quantity must be filled", Toast.LENGTH_SHORT).show();
        }else{
            finalValue=Integer.parseInt(value);
            order(finalValue);
            startActivity(intent);
        }

    }
}