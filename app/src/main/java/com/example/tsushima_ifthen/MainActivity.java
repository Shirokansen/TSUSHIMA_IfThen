package com.example.tsushima_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);

        TextView txtLore = findViewById(R.id.txtLore);
        txtLore.setText("The serpent of the lake asks you a question: \n Are you always telling the truth?");


        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){


        TextView txtDecision = findViewById(R.id.txtDecision);





        switch(view.getId()) {
            case R.id.btnDecision1:
                txtDecision.setText("You say yes, but the snake determines you have lied. \n The snake kills you.");
                break;
            case R.id.btnDecision2:
                txtDecision.setText("You say no, the snake appreciates your honesty and lets you live");
                break;
        }




    }
}