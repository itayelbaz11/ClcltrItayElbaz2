package com.example.user.clcltritayelbaz;

import android.content.Intent;
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
    int last=1;
    String lastAnswer="not yet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText) findViewById(R.id.editText);
    }

    public void plus(View view) {
        if(first) {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                x=Double.parseDouble(st);
                et.setHint(""+x);
                et.setText("");
                first=false;}
            else {
                et.setText("");
                et.setHint("Start Again");
                first=true;
            }
        }
        else {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                y=Double.parseDouble(st);
                switch (last) {
                    case 1: x=x+y;
                        break;
                    case 2: x=x-y;
                        break;
                    case 3: x=x*y;
                        break;
                    case 4: if(y!=0){
                               x=x/y;}
                             else{ et.setText("");
                                  et.setHint("Start Again");
                                  first=true;}
                            break;}
                et.setHint(""+x);
                et.setText("");
            }
            else {
                et.setText("");
                et.setHint("Start Again");
                first=true;
            }
        }

        last=1;
    }

    public void minus(View view) {

        if(first) {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                x=Double.parseDouble(st);
                et.setHint(""+x);
                et.setText("");
                first=false;}
            else {
                et.setText("");
                et.setHint("Start Again");
                first=true;
            }
        }
        else {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                y=Double.parseDouble(st);
                switch (last) {
                    case 1: x=x+y;
                        break;
                    case 2: x=x-y;
                        break;
                    case 3: x=x*y;
                        break;
                    case 4: if(y!=0){
                               x=x/y;}
                            else{ et.setText("");
                               et.setHint("Start Again");
                               first=true;}
                            break;}
                et.setHint(""+x);
                et.setText("");
            }
            else {
                et.setText("");
                et.setHint("Start Again");
                first=true;
            }
        }

        last=2;
    }



    public void multipy(View view) {


        if(first) {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                x=Double.parseDouble(st);
                et.setHint(""+x);
                et.setText("");
                first=false;}
            else {
                et.setText("");
                et.setHint("Start Again");
                first=true;
            }
        }
        else {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                y=Double.parseDouble(st);
                switch (last) {
                    case 1: x=x+y;
                        break;
                    case 2: x=x-y;
                        break;
                    case 3: x=x*y;
                        break;
                    case 4: if(y!=0){
                              x=x/y;}
                            else{ et.setText("");
                                  et.setHint("Start Again");
                                  first=true;}
                            break;}
                et.setHint(""+x);
                et.setText("");
            }
            else {
                et.setText("");
                et.setHint("Start Again");
                first=true;
            }
        }

        last=3;
    }



    public void devide(View view) {


        if(first) {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                x=Double.parseDouble(st);
                et.setText("");
                et.setHint(""+x);
                first=false;}
            else {
                et.setText("");
                et.setHint("Start Again");
                first=true;
            }
        }
        else {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                y=Double.parseDouble(st);
                switch (last) {
                    case 1: x=x+y;
                        break;
                    case 2: x=x-y;
                        break;
                    case 3: x=x*y;
                        break;
                    case 4: if(y!=0){
                             x=x/y;}
                             else{ et.setText("");
                                   et.setHint("Start Again");
                                   first=true;}
                             break;}
                et.setHint(""+x);
                et.setText("");
            }
            else {
                et.setText("");
                et.setHint("Start Again");
                first=true;
            }
        }

        last=4;
    }

    public void shave(View view) {
        if(first) {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                x=Double.parseDouble(st);
                et.setText("Answer="+x);
                first=false;}
            else {
                et.setText("");
                et.setHint("Start Again");
                first=true;
            }
        }
        else {
            st=et.getText().toString();
            if((st.length()!=0)&&(st.length()<=10)){
                y=Double.parseDouble(st);
                switch (last) {
                    case 1: x=x+y;
                            break;
                    case 2: x=x-y;
                            break;
                    case 3: x=x*y;
                            break;
                    case 4: if(y!=0){
                              x=x/y;}
                              else{ et.setText("");
                                   et.setHint("Start Again");
                                   first=true;}
                            break;}
                et.setText("Answer="+x);
                lastAnswer=""+x;
                }
            else {
                et.setText("");
                et.setHint("Start Again");
                first=true;
            }
        }



    }

    public void ac(View view) {
        et.setText("");
        et.setHint("");
        first=true;
    }

    public void About(View view) {
        Intent si=new Intent(this,Second.class);
        si.putExtra("Answer",lastAnswer);
        startActivity(si);}

    }

