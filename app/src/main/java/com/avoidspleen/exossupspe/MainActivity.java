package com.avoidspleen.exossupspe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView baseline_menu_action_bar = findViewById(R.id.baseline_menu_icon);
        TextView title = findViewById(R.id.tile_action_bar);

        baseline_menu_action_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Test action bar menu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}