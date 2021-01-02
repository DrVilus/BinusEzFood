package com.example.binusezfood;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.binusezfood.dummy.HistoryContent;

public class MyOrder extends AppCompatActivity {
    //Drinks
    public static int air = 0;
    public static int pukat = 0;
    public static int mangga = 0;

    //Foods
    public static int nasgor = 0;
    public static int miegor = 0;

    //snacks
    public static int kitkat = 0;
    public static int snickers = 0;

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

        TextView tvSaldo = findViewById(R.id.saldo);
        tvSaldo.setText("Saldo = " + TopUpActivity.saldo);
    }

    public static int hitungTotal(){
        return (air*1000 + pukat*5000 + mangga*5000 + nasgor*10000 + miegor*10000);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void onPay(View view){
        if(hitungTotal()==0) {
            Toast.makeText(getBaseContext(), "Order is Empty", Toast.LENGTH_SHORT).show();
        }else if(hitungTotal() > TopUpActivity.saldo){
            Toast.makeText(getBaseContext(), "Saldo tidak cukup", Toast.LENGTH_SHORT).show();
        }else{
            HistoryContent.ITEMS.add(new HistoryContent.Item(Integer.toString(HistoryContent.ITEMS.size()+1), OrderDetail(), hitungTotal()));

            Toast.makeText(getBaseContext(), "Order Complete", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, OrderComplete.class);
            startActivity(intent);
        }

    }

    public String OrderDetail(){
        String detail = "";
        if(air>0){
            detail+=("- Air = " + air+"\n");
        }
        if(pukat>0){
            detail+=("- Pukat = " + pukat+"\n");
        }
        if(mangga>0){
            detail+=("- Mangga = " + mangga+"\n");
        }

        return detail;
    }
}