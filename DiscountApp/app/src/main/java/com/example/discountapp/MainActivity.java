package com.example.discountapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText amount,discount;
    TextView res;
    Button submit;
    Double value = Double.valueOf(0);
    Double a;
    Double d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = (EditText) findViewById(R.id.amt);
        discount = (EditText) findViewById(R.id.dis);
        res = (TextView) findViewById(R.id.result);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = (Double) Double.parseDouble(String.valueOf(amount.getText()));
                d = (Double) Double.parseDouble(String.valueOf(discount.getText()));
                value = a - ((d / 100) * a);
                res.setText(String.format("The final amount after discount is %s", value));
            }
        });
    }


}
