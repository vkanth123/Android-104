package com.example.techgenysis.myapplication104;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SeekBar S;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        S =(SeekBar)findViewById(R.id.seekBar);
        textView =(TextView)findViewById(R.id.textView);
        S.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if((progress>=40)&&(progress<=45))
                    textView.setText("The seekbar is in the range 40-45 :)"+progress);
                else
                    textView.setText("Hi!!"+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Tracking started",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Tracking stopped",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
