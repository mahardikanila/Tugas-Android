package com.example.mahardikanila.uts;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by mahardika on 12-Mar-17.
 */

public class Soal2Activity extends AppCompatActivity {

    private EditText mNama, mPenumpang;
    private Button mButtPesawat, mButtKereta;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);

        mNama = (EditText) findViewById(R.id.namaPenumpang);
        mPenumpang = (EditText) findViewById(R.id.penumpang);
        mButtPesawat = (Button) findViewById(R.id.buttPesawat);
        mButtKereta = (Button) findViewById(R.id.buttKereta);

        mButtPesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPes = new Intent(Soal2Activity.this, Hasil2Activity.class);

                String namaPenumpang = mNama.getText().toString();
                String bnykPenumpang = mPenumpang.getText().toString();

                int bnyk = Integer.parseInt(bnykPenumpang);
                int totalHarga = bnyk * 500000;
                String harganya = String.valueOf(totalHarga);

                intentPes.putExtra("nama", namaPenumpang);
                intentPes.putExtra("banyak", bnykPenumpang);
                intentPes.putExtra("harga", harganya);

                startActivity(intentPes);
            }
        });

        mButtKereta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentPes = new Intent(Soal2Activity.this, Hasil2Activity.class);

                String namaPenumpang = mNama.getText().toString();
                String bnykPenumpang = mPenumpang.getText().toString();

                int bnyk = Integer.parseInt(bnykPenumpang);
                int totalHarga = bnyk * 300000;
                String harganya = String.valueOf(totalHarga);

                intentPes.putExtra("nama", namaPenumpang);
                intentPes.putExtra("banyak", bnykPenumpang);
                intentPes.putExtra("harga", harganya);

                startActivity(intentPes);
            }
        });


    }
}
