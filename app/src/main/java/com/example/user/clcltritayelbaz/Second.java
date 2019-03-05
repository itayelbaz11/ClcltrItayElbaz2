package com.example.user.clcltritayelbaz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent gi=getIntent();
        String st=gi.getStringExtra("Answer");
        TV=(TextView) findViewById(R.id.TV);
        TV.setText(st);

    }


    public void back(View view) {
        Intent goI=new Intent(this,MainActivity.class);
        startActivity(goI);
    }
}
