package com.avoidspleen.exossupspe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class main_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ImageView baseline_menu_action_bar = findViewById(R.id.baseline_menu_icon);

        baseline_menu_action_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(main_menu.this, MainActivity.class);
                main_menu.this.startActivity(main);
            }
        });
    }
}