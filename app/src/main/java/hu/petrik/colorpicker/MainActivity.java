package hu.petrik.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private SeekBar SeekbarR;
    private SeekBar SeekbarG;
    private SeekBar SeekbarB;

    private int red;
    private int green;
    private int blue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        SeekbarR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                red = SeekbarR.getProgress();
                textView.setText("(" + Integer.toString(red) + "," + Integer.toString(green) + "," + Integer.toString(blue) + ")");
                textView.setBackgroundColor(Color.rgb(red, green, blue));
                if (red > 200 || green > 170){
                    textView.setTextColor(Color.BLACK);
                }
                else if (red < 200 || green < 170){
                    textView.setTextColor(Color.WHITE);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekbarG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                green = SeekbarG.getProgress();
                textView.setText("(" + Integer.toString(red) + "," + Integer.toString(green) + "," + Integer.toString(blue) +  ")");
                textView.setBackgroundColor(Color.rgb(red, green, blue));
                if (red > 200 || green > 170){
                    textView.setTextColor(Color.BLACK);
                }
                else if (red < 200 || green < 170){
                    textView.setTextColor(Color.WHITE);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekbarB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                blue = SeekbarB.getProgress();
                textView.setText("(" + Integer.toString(red) + "," + Integer.toString(green) + "," + Integer.toString(blue) +  ")");
                textView.setBackgroundColor(Color.rgb(red, green, blue));
                if (red > 200 || green > 170){
                    textView.setTextColor(Color.BLACK);
                }
                else if (red < 200 || green < 170){
                    textView.setTextColor(Color.WHITE);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void init(){
        textView = findViewById(R.id.TextView);
        SeekbarR = findViewById(R.id.SeekbarR);
        SeekbarG = findViewById(R.id.SeekbarG);
        SeekbarB = findViewById(R.id.SeekbarB);
    }
}