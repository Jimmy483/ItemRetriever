package com.jimmy.ItemRetriever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText firstno;
    private EditText secondno;
    private RadioButton add;
    private RadioButton multiply;
    private RadioButton divide;
    private Button Calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstno=findViewById(R.id.first);
        secondno=findViewById(R.id.second);
        add=findViewById(R.id.rdoAdd);
        multiply=findViewById(R.id.rdoMultiply);
        divide=findViewById(R.id.rdoDivide);
        Calc=findViewById(R.id.btnCalc);

        Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a;
                int b,result;
                a=Integer.parseInt(firstno.getText().toString());
                b=Integer.parseInt(secondno.getText().toString());

                if(v.getId()==R.id.btnCalc)
                {
                    if(add.isChecked())
                    {
                        result=a+b;
                    }
                    else if(multiply.isChecked())
                    {
                        result=a*b;
                    }
                    else if(divide.isChecked())
                    {
                        result=a/b;
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Please Select an operator",Toast.LENGTH_LONG).show();
                        return;
                    }

                    Toast.makeText(MainActivity.this,"ans=" + result,Toast.LENGTH_SHORT).show();

                }

            }
        });







    }

}
