package com.example.temperatureconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.inputValue);

    }

    // this method is called at button click because we assigned the name to the
    // "OnClick" property of the button
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Intent intent;
                RadioButton celsiusButton = (RadioButton) findViewById(R.id.radio0);
                RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radio1);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if (celsiusButton.isChecked()) {
                    intent = new Intent(this, showCelsius.class);
                    String res = Float.toString(ConverterUtil.convertCelsiusToFahrenheit(inputValue));
                    intent.putExtra("original", Float.toString(inputValue));
                    intent.putExtra("result", res);
                    //text.setText(String
                    //        .valueOf(ConverterUtil.convertFahrenheitToCelsius(inputValue)));
                    celsiusButton.setChecked(false);
                    fahrenheitButton.setChecked(false);
                } else {
                    //text.setText(String
                    //        .valueOf(ConverterUtil.convertCelsiusToFahrenheit(inputValue)));

                    intent = new Intent(this, showFarenheit.class);
                    String res =  Float.toString(ConverterUtil.convertFahrenheitToCelsius(inputValue));
                    intent.putExtra("original", Float.toString(inputValue));
                    intent.putExtra("result", res);
                    fahrenheitButton.setChecked(false);
                    celsiusButton.setChecked(false);
                }
                startActivity(intent);
                break;
        }
    }
}