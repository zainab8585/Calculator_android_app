package com.example.wafaa.cacculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1 , num2 ;
    TextView res ;
    String n1 ;
    String n2 ;
    int r ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 =  (EditText) findViewById(R.id.num1);
        num2 =(EditText)findViewById(R.id.num2) ;
        res=(TextView)findViewById(R.id.res);
    }

    public void div(View view) {
        n1=  num1.getText().toString();
        n2=num2.getText().toString() ;
        int n11 = Integer.parseInt(n1);
        int n22 = Integer.parseInt(n2);
        if(n11==0){
            r = 0;
        }
        r = n11/n22 ;
    }
    public void add(View view) {
        n1=  num1.getText().toString();
        n2=num2.getText().toString() ;
        int n11 = Integer.parseInt(n1);
        int n22 = Integer.parseInt(n2);

        r = n11+n22 ;

    }public void sub(View view) {
        n1=  num1.getText().toString();
        n2=num2.getText().toString() ;
        int n11 = Integer.parseInt(n1);
        int n22 = Integer.parseInt(n2);
        r = n11-n22 ;
    }

    public void mul(View view) {
        n1=  num1.getText().toString();
        n2=num2.getText().toString() ;
        int n11 = Integer.parseInt(n1);
        int n22 = Integer.parseInt(n2);

        r = n11*n22 ;
    }

    public void res(View view) {
        res.setText(r+"");
    }
}
