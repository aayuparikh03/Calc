package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    EditText e1,e2,e3;

    Button b1,b2,b3,b4;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView);
        e1=findViewById(R.id.editTextText);
        e2=findViewById(R.id.editTextText2);
        e3=findViewById(R.id.editTextText3);
        e3.setEnabled(false);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);

        operation o=new operation();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=o.add(Integer.parseInt(e1.getText().toString()),Integer.parseInt(e2.getText().toString()));
                e3.setText(Integer.toString(a));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=o.sub(Integer.parseInt(e1.getText().toString()),Integer.parseInt(e2.getText().toString()));
                e3.setText(Integer.toString(a));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=o.mul(Integer.parseInt(e1.getText().toString()),Integer.parseInt(e2.getText().toString()));
                e3.setText(Integer.toString(a));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=o.div(Integer.parseInt(e1.getText().toString()),Integer.parseInt(e2.getText().toString()));
                e3.setText(Integer.toString(a));
            }
        });



    }
}