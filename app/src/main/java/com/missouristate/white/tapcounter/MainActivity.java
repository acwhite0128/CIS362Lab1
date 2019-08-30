package com.missouristate.white.tapcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private CounterModel counterModel;
    TextView numberTextView;
    Button incrementButton;
    int baseCount = 0;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        counterModel = new CounterModel(baseCount);
        setContentView(R.layout.activity_main);

        numberTextView = findViewById(R.id.tv_number);
        incrementButton = findViewById(R.id.btn_tap);

        //on launch TextView will show zero
        numberTextView.setText("0");

    }
    //Called when user clicks on Tap Button
        public void onClick(View v)
        {
            int newCount;

            numberTextView = findViewById(R.id.tv_number);
            String numberSting = numberTextView.getText().toString();
            try
            {
                int currentCount = Integer.parseInt(numberSting);
                //update the Model
                counterModel.setCount(currentCount);
                //ask Model for new count
                newCount = counterModel.getCount();
                numberTextView.setText(String.valueOf(newCount));
            }
            catch (NumberFormatException nfe)
            {
                //pop up alert view here
            }
        }
}