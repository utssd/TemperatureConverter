package com.example.temperatureconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by shidashen on 11/15/17.
 */

public class showCelsius extends Activity implements View.OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showcelsius);
        TextView tv = (TextView) findViewById(R.id.textView2);
        String s = getIntent().getStringExtra("original") + "F is " + getIntent().getStringExtra("result") + "C";
        tv.setText(s);
        findViewById(R.id.Button_back).setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.Button_back:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
        }
    }
}
