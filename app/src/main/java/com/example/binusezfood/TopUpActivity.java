package com.example.binusezfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class TopUpActivity extends AppCompatActivity {

    public static int saldo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up);
        this.setTitle("BinusEZFoody: Top Up");
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        TextView tvSaldo = findViewById(R.id.saldo);
        tvSaldo.setText("Saldo = " + saldo);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void onTopUpBtn(View view){
        Intent intent = new Intent(this, MainActivity.class);
        EditText topup = findViewById(R.id.editTextTopUp);
        String value= topup.getText().toString();
        long finalValue = 0;
        if(!value.isEmpty()){
            finalValue=Integer.parseInt(value);
        }
        if(value.isEmpty()) {
            Toast.makeText(getBaseContext(), "Top Up must be filled", Toast.LENGTH_SHORT).show();
        }else if(finalValue > 2000000){
            Toast.makeText(getBaseContext(), "Top Up must not exceed 2 000 000 ", Toast.LENGTH_SHORT).show();
        }else{
            saldo+=finalValue;
            Toast.makeText(getBaseContext(), "Top Up Success", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
    }
}