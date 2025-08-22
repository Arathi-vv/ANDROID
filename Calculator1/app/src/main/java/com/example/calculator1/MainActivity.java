//package com.example.calculator1;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//public class MainActivity extends AppCompatActivity {
//
//    EditText num1,num2;
//    TextView res;
//    Button add,sub,div,mul;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        num1=findViewById(R.id.n1);
//        num2=findViewById(R.id.n2);
//        add=findViewById(R.id.badd);
//        sub=findViewById(R.id.bsub);
//        div=findViewById(R.id.bdiv);
//        mul=findViewById(R.id.bmul);
//        res=findViewById(R.id.reslt);
//
//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int a=Integer.parseInt(num1.getText().toString());
//                int b=Integer.parseInt(num1.getText().toString());
//                res.setText("Result" + (a+b));
//            }
//        });
//
//        sub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int a=Integer.parseInt(num1.getText().toString());
//                int b=Integer.parseInt(num1.getText().toString());
//                res.setText("Result" + (a-b));
//            }
//        });
//
//        div.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int a=Integer.parseInt(num1.getText().toString());
//                int b=Integer.parseInt(num1.getText().toString());
//                if (a!=0){
//                    int result=(a/b);
//                }
//                else{
//                    res.setText("cannot divide by 0");
//                }
//
//            }
//        });
//
//        mul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int a=Integer.parseInt(num1.getText().toString());
//                int b=Integer.parseInt(num1.getText().toString());
//                res.setText("Result" + (a*b));
//            }
//        });
//
//        }
//    private int getInput(EditText field) {
//        String text = field.getText().toString();
//        if (text.isEmpty()) {
//            return 0;
//        }
//        return 0;
//    }}




//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

package com.example.calculator1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText Number1,Number2;
    TextView Result;

    Button addition,substraction,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Number1=findViewById(R.id.no1);
        Number2=findViewById(R.id.no2);
        addition=findViewById(R.id.button1);
        substraction=findViewById(R.id.button2);
        multiplication=findViewById(R.id.button3);
        division=findViewById(R.id.button4);
        Result=findViewById(R.id.rslt);

        // ADDITION
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = getInput(Number1);
                double num2 = getInput(Number2);
                double res = num1 + num2;
                Result.setText("Result: " + res);
            }
        });

        // SUBTRACTION
        substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = getInput(Number1);
                double num2 = getInput(Number2);
                double res = num1 - num2;
                Result.setText("Result: " + res);
            }
        });

        // MULTIPLICATION
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = getInput(Number1);
                double num2 = getInput(Number2);
                double res = num1 * num2;
                Result.setText("Result: " + res);
            }
        });

        // DIVISION
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = getInput(Number1);
                double num2 = getInput(Number2);
                if (num2 != 0) {
                    double res = num1 / num2;
                    Result.setText("Result: " + res);
                } else {
                    Result.setText("Cannot divide by zero!");
                }
            }
        });
    }

    // Helper function to convert EditText to double
    private double getInput(EditText field) {
        String text = field.getText().toString();
        if (text.isEmpty()) return 0;
        return Double.parseDouble(text);
    }
}