package com.example.praktinis_darbas_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "DemoInitialApp";
    private Button firstButton;
    private Button secondButton;
    private Button thirdButton;
    private Button fourthButton;
    private TextView TextView_My;

    final int white = 0xFFffffff;
    final int black = 0xFF000000;


    /**
     * Called when the activity is first created.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons

        firstButton = (Button) findViewById(R.id.btnDeleteAppear);

        TextView_My = (TextView) findViewById(R.id.myTextView);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView_My.getVisibility() == View.VISIBLE) {
                    TextView_My.setVisibility(View.GONE);
                } else {
                    TextView_My.setVisibility(View.VISIBLE);
                }

            }
        });

        secondButton = (Button) findViewById(R.id.btnChangeTextColor);

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = TextView_My.getCurrentTextColor();
                if (color == Color.parseColor("#0F9D58"))
                {
                TextView_My.setTextColor(Color.parseColor("#FF000000"));
                }
                else
                {
                    TextView_My.setTextColor(Color.parseColor("#0F9D58"));
                }
            }
        });

        thirdButton = (Button) findViewById(R.id.btnBlackBackground);

        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set_My_Screen_Color(Color.BLACK);
            }
        });

        fourthButton = (Button) findViewById(R.id.btnWhiteBackground);

        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set_My_Screen_Color(Color.WHITE);
            }
        });


    }

    public void set_My_Screen_Color(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }


}