package com.example.countdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView showCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = (TextView)findViewById(R.id.timerDisplay);
    }

    public void startTimer(View view)throws InterruptedException
    {
        new CountDownTimer(10000,1000)
        {
            public void onTick(long millisUntilFinished)
            {
                showCount.setText(Long.toString(millisUntilFinished / 1000+1));
            }
            public void onFinish()
            {
                showCount.setText("BOOM");
            }
        }.start();
    }
}