package com.example.mahardikanila.uts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button butt, butt1, butt2, butt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butt1 = (Button)findViewById(R.id.soal1);
        butt2 = (Button)findViewById(R.id.soal2);
        butt3 = (Button)findViewById(R.id.soal3);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Soal1Activity.class);
                startActivity(intent1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Soal2Activity.class);
                startActivity(intent2);
            }
        });

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, Soal3Activity.class);
                startActivity(intent3);
            }
        });

    }
}
