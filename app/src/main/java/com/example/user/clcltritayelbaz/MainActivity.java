package com.example.user.clcltritayelbaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.EmptyStackException;

public class MainActivity extends AppCompatActivity {

    EditText et;
    double x,y;
    boolean first=true;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText) findViewById(R.id.editText);
    }

    public void plus(View view) {
        if(first) {
            st=et.getText().toString();
            if(st!=""){
            x=Double.parseDouble(st);
            et.setText("");
            et.setHint(""+x);
            first=false;}
            else{et.setText("");
                et.setHint("Start Again");}
        }
        else {
            st=et.getText().toString();
            Toast.makeText(this, st, Toast.LENGTH_SHORT).show();
            if(st!=""){
            y=Double.parseDouble(st);
            x=x+y;
            et.setText("");
            et.setHint(""+x);}
            else {
                et.setText("");
                et.setHint("Start Again");
            }
        }

    }

    public void minus(View view) {
    }

    public void multipy(View view) {
    }

    public void devide(View view) {
    }
}
