package com.god_s_eye.nobacknobehind.godseye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button testBtn = (Button)findViewById(R.id.testBtn);

        testBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, AddCCTVActivity.class);
                startActivity(i);
            }
        });
    }
}
