package com.example.roberto.simpletip;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    Button btn;
    EditText etAmount;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btn10);
        btn.setOnClickListener(this);
        btn=(Button) findViewById(R.id.btn20);
        btn.setOnClickListener(this);
        etAmount = (EditText) findViewById(R.id.etAmount);
        tv = (TextView) findViewById(R.id.textView2);
    }

    @Override
    public void onClick(View v) {
        String strAmount = etAmount.getText().toString();
        double dblAmount = Double.parseDouble(strAmount);
        double dblTip;

        int i = v.getId();
        if (i==R.id.btn10){

        dblTip = dblAmount*0.1;
            String strTip=String.valueOf(dblTip);
            tv.setText(strTip);
            return;
        }
        if (i==R.id.btn20){
            dblTip = dblAmount*0.2;
            String strTip=String.valueOf(dblTip);
            tv.setText(strTip);
            return;
        }
    }
}
