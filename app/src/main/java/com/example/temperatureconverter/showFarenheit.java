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

public class showFarenheit extends Activity implements View.OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_farenheit);
        TextView tv = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String s = intent.getStringExtra("original") + "C is " + intent.getStringExtra("result") + "F";
        tv.setText(s);
        findViewById(R.id.Button_back).setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.Button_back:
                intent = new Intent(this, MainActivity.class);
        }
    }
}
